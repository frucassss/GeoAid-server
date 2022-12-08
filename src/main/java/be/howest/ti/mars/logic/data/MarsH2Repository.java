package be.howest.ti.mars.logic.data;

import be.howest.ti.mars.logic.domain.*;
import be.howest.ti.mars.logic.domain.statistics.OxygenLeak;
import be.howest.ti.mars.logic.exceptions.RepositoryException;
import be.howest.ti.mars.logic.util.DangerLevel;
import org.h2.tools.Server;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
This is only a starter class to use an H2 database.
In this start project there was no need for a Java interface MarsRepository.
Please always use interfaces when needed.

To make this class useful, please complete it with the topics seen in the module OOA & SD
 */

public class MarsH2Repository {
    private static final Logger LOGGER = Logger.getLogger(MarsH2Repository.class.getName());
    private static final String SQL_QUOTA_BY_ID = "select id, quote from quotes where id = ?;";
    private static final String SQL_INSERT_QUOTE = "insert into quotes (`quote`) values (?);";
    private static final String SQL_UPDATE_QUOTE = "update quotes set quote = ? where id = ?;";
    private static final String SQL_DELETE_QUOTE = "delete from quotes where id = ?;";
    private static final String SQL_ALL_DOMES = "select id, domename, latitude, longitude from domes;";
    private static final String SQL_ALL_USERS = "select id, firstName, lastName, homeAddress, premium role from users;";
    private static final String SQL_ALL_COMPANIES = "select id, name, section, ad_effectiveness, user_id from companies;";
    private static final String SQL_COMPANY_BY_ID = "select id, name, section, ad_effectiveness, user_id from companies where user_id = ?;";
    private static final String SQL_ALL_OXYGENLEAKS = "select id, danger_level, dome_id, date from oxygen_leaks;";
    private static final String DOME_ID = "dome_id";
    private static final String ID = "id";
    private final Server dbWebConsole;
    private final String username;
    private final String password;
    private final String url;

    public MarsH2Repository(String url, String username, String password, int console) {
        try {
            this.username = username;
            this.password = password;
            this.url = url;
            this.dbWebConsole = Server.createWebServer(
                    "-ifNotExists",
                    "-webPort", String.valueOf(console)).start();
            LOGGER.log(Level.INFO, "Database web console started on port: {0}", console);
            this.generateData();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "DB configuration failed", ex);
            throw new RepositoryException("Could not configure MarsH2repository");
        }
    }

    public Quote getQuote(int id) {
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_QUOTA_BY_ID)
        ) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Quote(rs.getInt("id"), rs.getString("quote"));
                } else {
                    return null;
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to get quote.", ex);
            throw new RepositoryException("Could not get quote.");
        }
    }

    public Quote insertQuote(String quoteValue) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_INSERT_QUOTE, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, quoteValue);

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            Quote quote = new Quote(quoteValue);
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    quote.setId(generatedKeys.getInt(1));
                    return quote;
                } else {
                    throw new SQLException("Creating quote failed, no ID obtained.");
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to create quote.", ex);
            throw new RepositoryException("Could not create quote.");
        }
    }

    public Quote updateQuote(int quoteId, String quote) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE_QUOTE)) {

            stmt.setString(1, quote);
            stmt.setInt(2, quoteId);
            stmt.executeUpdate();
            return new Quote(quoteId, quote);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to update quote.", ex);
            throw new RepositoryException("Could not update quote.");
        }
    }

    public void deleteQuote(int quoteId) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_DELETE_QUOTE)) {

            stmt.setInt(1, quoteId);
            stmt.execute();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to delete quote.", ex);
            throw new RepositoryException("Could not delete quote.");
        }
    }


    public void cleanUp() {
        if (dbWebConsole != null && dbWebConsole.isRunning(false))
            dbWebConsole.stop();

        try {
            Files.deleteIfExists(Path.of("./db-18.mv.db"));
            Files.deleteIfExists(Path.of("./db-18.trace.db"));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Database cleanup failed.", e);
            throw new RepositoryException("Database cleanup failed.");
        }
    }

    public void generateData() {
        try {
            executeScript("db-create.sql");
            executeScript("db-populate.sql");
        } catch (IOException | SQLException ex) {
            LOGGER.log(Level.SEVERE, "Execution of database scripts failed.", ex);
        }
    }

    private void executeScript(String fileName) throws IOException, SQLException {
        String createDbSql = readFile(fileName);
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(createDbSql);
        ) {
            stmt.executeUpdate();
        }
    }

    private String readFile(String fileName) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null)
            throw new RepositoryException("Could not read file: " + fileName);

        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public List<Dome> getDomes() {
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_ALL_DOMES)
        ) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<Dome> domes = new ArrayList<>();
                while (rs.next()) {
                    domes.add(new Dome(rs.getInt(ID), rs.getString("domename"), rs.getDouble("latitude"), rs.getDouble("longitude")));
                }
                return domes;
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to get domes.", ex);
            throw new RepositoryException("Could not get domes.");
        }
    }

    public List<User> getUsers() {
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_ALL_USERS)
        ) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    users.add(new User(rs.getInt(ID), rs.getString("firstname"), rs.getString("lastname"), rs.getString("homeAddress"), rs.getString("premium")));
                }
                return users;
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to get users.", ex);
            throw new RepositoryException("Could not get users.");
        }
    }

    public List<Company> getCompanies() {
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_ALL_COMPANIES)
        ) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<Company> companies = new ArrayList<>();
                while (rs.next()) {
                    companies.add(new Company(rs.getInt(ID), rs.getString("name"), rs.getString("section"), rs.getInt("ad_effectiveness"), rs.getInt("user_Id")));
                }
                return companies;
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to get companies.", ex);
            throw new RepositoryException("Could not get companies.");
        }
    }

    public Company getCompany(int userId) {
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_COMPANY_BY_ID)
        ) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Company(rs.getInt(ID), rs.getString("name"), rs.getString("section"), rs.getInt("ad_effectiveness"), rs.getInt("user_Id"));
                } else {
                    throw new RepositoryException("Could not find company with user id: " + userId);
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to get company.", ex);
            throw new RepositoryException("Could not get company.");
        }
    }

    public List<OxygenLeak> getOxygenLeaks() {
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_ALL_OXYGENLEAKS)
        ) {
            try (ResultSet rs = stmt.executeQuery()) {
                List<OxygenLeak> oxygenLeaks = new ArrayList<>();
                while (rs.next()) {
                    String dangerLevel = rs.getString("danger_level");
                    if (dangerLevel.equals("low")) {
                        oxygenLeaks.add(new OxygenLeak(rs.getInt(ID), DangerLevel.LOW, rs.getInt(DOME_ID), rs.getDate("date").toString()));
                    } else if (dangerLevel.equals("medium")) {
                        oxygenLeaks.add(new OxygenLeak(rs.getInt(ID), DangerLevel.MEDIUM, rs.getInt(DOME_ID), rs.getDate("date").toString()));
                    } else if (dangerLevel.equals("high")) {
                        oxygenLeaks.add(new OxygenLeak(rs.getInt(ID), DangerLevel.HIGH, rs.getInt(DOME_ID), rs.getDate("date").toString()));
                    }
                }
                return oxygenLeaks;
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to get oxygen leaks.", ex);
            throw new RepositoryException("Could not get oxygen leaks.");
        }
    }
}

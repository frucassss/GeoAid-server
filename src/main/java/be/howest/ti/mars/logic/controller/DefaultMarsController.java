package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.data.Repositories;
import be.howest.ti.mars.logic.domain.*;
import be.howest.ti.mars.logic.domain.statistics.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * DefaultMarsController is the default implementation for the MarsController interface.
 * The controller shouldn't even know that it is used in an API context..
 *
 * This class and all other classes in the logic-package (or future sub-packages)
 * should use 100% plain old Java Objects (POJOs). The use of Json, JsonObject or
 * Strings that contain encoded/json data should be avoided here.
 * Keep libraries and frameworks out of the logic packages as much as possible.
 * Do not be afraid to create your own Java classes if needed.
 */
public class DefaultMarsController implements MarsController {
    private static final String MSG_QUOTE_ID_UNKNOWN = "No quote with id: %d";

    @Override
    public Quote getQuote(int quoteId) {
        Quote quote = Repositories.getH2Repo().getQuote(quoteId);
        if (null == quote)
            throw new NoSuchElementException(String.format(MSG_QUOTE_ID_UNKNOWN, quoteId));

        return quote;
    }

    @Override
    public Quote createQuote(String quote) {
        if (StringUtils.isBlank(quote))
            throw new IllegalArgumentException("An empty quote is not allowed.");

        return Repositories.getH2Repo().insertQuote(quote);
    }

    @Override
    public Quote updateQuote(int quoteId, String quote) {
        if (StringUtils.isBlank(quote))
            throw new IllegalArgumentException("No quote provided!");

        if (quoteId < 0)
            throw new IllegalArgumentException("No valid quote ID provided");

        if (null == Repositories.getH2Repo().getQuote(quoteId))
            throw new NoSuchElementException(String.format(MSG_QUOTE_ID_UNKNOWN, quoteId));

        return Repositories.getH2Repo().updateQuote(quoteId, quote);
    }

    @Override
    public void deleteQuote(int quoteId) {
        if (null == Repositories.getH2Repo().getQuote(quoteId))
            throw new NoSuchElementException(String.format(MSG_QUOTE_ID_UNKNOWN, quoteId));

        Repositories.getH2Repo().deleteQuote(quoteId);
    }

    @Override
    public List<Dome> getDomes() {
        List<Dome> domes = Repositories.getH2Repo().getDomes();
        if(domes.isEmpty()) {
            throw new NoSuchElementException("No domes found!");
        }
        return domes;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = Repositories.getH2Repo().getUsers();
        if (users.isEmpty()) {
            throw new NoSuchElementException("No users found!");
        }
        return users;
    }

    @Override
    public List<Company> getCompanies() {
        List<Company> companies = Repositories.getH2Repo().getCompanies();
        if (companies.isEmpty()) {
            throw new NoSuchElementException("No companies found!");
        }
        return companies;
    }

    @Override
    public Company getCompany(int companyId) {
        Company company = Repositories.getH2Repo().getCompany(companyId);
        if (null == company) {
            throw new NoSuchElementException(String.format("No company with id: %d", companyId));
        }
        return company;
    }

    @Override
    public List<OxygenLeak> getOxygenLeaks() {
        List<OxygenLeak> oxygenLeaks = Repositories.getH2Repo().getOxygenLeaks();
        if (oxygenLeaks.isEmpty()) {
            throw new NoSuchElementException("No oxygen leaks found!");
        }
        return oxygenLeaks;
    }

    @Override
    public List<Appointment> getAppointments() {
        List<Appointment> appointments = Repositories.getH2Repo().getAppointments();
        if (appointments.isEmpty()) {
            throw new NoSuchElementException("No appointments found!");
        }
        return appointments;
    }

    @Override
    public Appointment createAppointment(Map<String, String> appointment) {
        if (appointment.isEmpty()) {
            throw new IllegalArgumentException("No appointment provided!");
        }
        return Repositories.getH2Repo().insertAppointment(appointment);
    }

    @Override
    public List<Population> getPopulation() {
        List<Population> population = Repositories.getH2Repo().getPopulation();
        if (population.isEmpty()) {
            throw new NoSuchElementException("No population found!");
        }
        return population;
    }
}
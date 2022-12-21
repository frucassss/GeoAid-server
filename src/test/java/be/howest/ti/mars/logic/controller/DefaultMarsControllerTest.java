package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.data.Repositories;
import be.howest.ti.mars.logic.domain.Dome;
import be.howest.ti.mars.logic.domain.Quote;
import be.howest.ti.mars.logic.util.Colony;
import be.howest.ti.mars.logic.util.DamageLevel;
import be.howest.ti.mars.logic.util.TypeOfDispatch;
import io.vertx.core.json.JsonObject;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DefaultMarsControllerTest {

    private static final String URL = "jdbc:h2:./db-18";

    @BeforeAll
    void setupTestSuite() {
        Repositories.shutdown();
        JsonObject dbProperties = new JsonObject(Map.of("url", "jdbc:h2:./db-18",
                "username", "",
                "password", "",
                "webconsole.port", 9000));
        Repositories.configure(dbProperties);
    }

    @BeforeEach
    void setupTest() {
        Repositories.getH2Repo().generateData();
    }

    @Test
    void getQuote() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act
        Quote quote = sut.getQuote(0);

        //Assert
        assertTrue(quote != null && StringUtils.isNoneBlank(quote.getValue()));
    }

    @Test
    void deleteQuote() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act
        sut.deleteQuote(0);

        //Assert
        assertThrows(NoSuchElementException.class, () -> sut.getQuote(0));
    }

    @Test
    void updateQuote() {
        // Arrange
        MarsController sut = new DefaultMarsController();
        Quote quote = sut.createQuote("some value");

        // Act
        Quote updatedQuoted = sut.updateQuote(quote.getId(), "new value");

        //Assert
        assertEquals("new value", updatedQuoted.getValue());
    }

    @Test
    void createQuote() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act
        Quote quote = sut.createQuote("new value");

        //Assert
        assertEquals("new value", quote.getValue());
    }

    @Test
    void getQuoteWithUnknownIdThrowsNotFound() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act + Assert
        assertThrows(NoSuchElementException.class, () -> sut.getQuote(-1));
    }

    @Test
    void createQuoteWithEmptyQuoteThrowsIllegalArgument() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> sut.createQuote(""));
    }

    @Test
    void updateQuoteWithWrongIdThrowsIllegalArgument() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> sut.updateQuote(-1, "some quote"));
    }

    @Test
    void updateQuoteWithUnknownIdThrowsNoSuchElementException() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act + Assert
        assertThrows(NoSuchElementException.class, () -> sut.updateQuote(1000, "some quote"));
    }

    @Test
    void updateQuoteWithEmptyQuoteThrowsIllegalArgument() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> sut.updateQuote(1, ""));
    }

    @Test
    void deleteQuoteWithUnknownIdThrowsNotFound() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act + Assert
        assertThrows(NoSuchElementException.class, () -> sut.deleteQuote(-1));
    }

    @Test
    void getDomes() {
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var domes = sut.getDomes();

        //Assert
        assertEquals(3, domes.size());
    }

    @Test
    void getUsers() {
        // Arrange
        MarsController sut = new DefaultMarsController();

        // Act
        var users = sut.getUsers();

        //Assert
        assertEquals(4, users.size());
    }

    @Test
    void getCompanies() {
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var companies = sut.getCompanies();

        //Assert
        assertEquals(3, companies.size());
    }

    @Test
    void getCompany(){
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var company = sut.getCompany(1);

        //Assert
        assertEquals("company 1", company.getName());
    }

    @Test
    void getAppointments() {
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var appointments = sut.getAppointments();

        //Assert
        assertEquals(4, appointments.size());
    }

    @Test
    void createAppointment() {
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        Map<String, String> appointmentData = Map.of(
                "date", "2021-01-01",
                "time", "12:00:00",
                "topic", "some topic",
                "employeeID", "1",
                "expertise", "some expertise"
        );
        var appointment = sut.createAppointment(appointmentData);

        //Assert
        assertEquals(1, appointment.getId());
        assertEquals("2021-01-01", appointment.getDate());
        assertEquals("12:00:00", appointment.getTime());
        assertEquals("some topic", appointment.getTopic());
        assertEquals(1, appointment.getEmployeeId());
        assertEquals("some expertise", appointment.getExpertise());
    }

    @Test
    void createAppointmentWithWrongDateThrowsIllegalArgument() {
        // Arrange
        MarsController sut = new MockMarsController();

        // Act + Assert
        Map<String, String> appointmentData = Map.of(
                "date", "2021-01-01",
                "time", "12:00:00",
                "topic", "some topic",
                "employeeID", "dertig",
                "expertise", "some expertise"
        );
        assertThrows(IllegalArgumentException.class, () -> sut.createAppointment(appointmentData));
    }

    @Test
    void getPopulation() {
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var population = sut.getPopulation();

        //Assert
        assertEquals(6, population.size());
        assertEquals(1, population.get(0).getId());
        assertEquals(60, population.get(1).getSize());
        assertEquals(100, population.get(2).getLatitude());
        assertEquals(-951, population.get(3).getLongitude());
        assertEquals(Colony.SPACESTATION, population.get(3).getColony());
    }

    @Test
    void getMedicalDispatches(){
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var medicalDispatches = sut.getMedicalDispatches();

        //Assert
        assertEquals(5, medicalDispatches.size());
        assertEquals(1, medicalDispatches.get(0).getId());
        assertEquals(TypeOfDispatch.POLICE, medicalDispatches.get(1).getDispachType());
        assertEquals(medicalDispatches.get(1).getDome(), medicalDispatches.get(2).getDome());
        assertEquals("2022-01-01", medicalDispatches.get(3).getDate());
    }

    @Test
    void getMeteorShowers(){
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var meteorShowers = sut.getMeteorShowers();

        //Assert
        assertEquals(3, meteorShowers.size());
        assertEquals(1, meteorShowers.get(0).getId());
        assertEquals("2022-12-12", meteorShowers.get(1).getDate());
        assertEquals(1, meteorShowers.get(2).getDome().getId());
        assertEquals(DamageLevel.HIGH, meteorShowers.get(2).getDamageLevel());
    }

    @Test
    void getDustStorms(){
        // Arrange
        MarsController sut = new MockMarsController();

        // Act
        var dustStorms = sut.getDustStorms();

        //Assert
        assertEquals(3, dustStorms.size());
        assertEquals(1, dustStorms.get(0).getId());
        assertEquals("2022-12-12", dustStorms.get(1).getDate());
        assertEquals(1, dustStorms.get(2).getDome().getId());
        assertEquals(DamageLevel.HIGH, dustStorms.get(2).getDamageLevel());
    }
}

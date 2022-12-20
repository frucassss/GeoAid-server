package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.*;
import be.howest.ti.mars.logic.domain.statistics.OxygenLeak;
import be.howest.ti.mars.logic.domain.statistics.Population;
import be.howest.ti.mars.logic.util.Colony;
import be.howest.ti.mars.logic.util.DangerLevel;

import java.util.List;
import java.util.Map;

public class MockMarsController implements MarsController {
    private static final String SOME_QUOTE = "quote";
    @Override
    public Quote getQuote(int quoteId) {
        return new Quote(quoteId, SOME_QUOTE);
    }

    @Override
    public Quote createQuote(String quote) {
        return new Quote(1, quote);
    }

    @Override
    public Quote updateQuote(int quoteId, String quote) {
        return new Quote(quoteId, quote);
    }

    @Override
    public void deleteQuote(int quoteId) {
    }

    @Override
    public List<Dome> getDomes() {
        double surface = 40.3;
        List<Dome> domes = List.of(
                new Dome(1, "Dome 1", 1.0, 1.0, surface),
                new Dome(2, "Dome 2", 2.0, 2.0, surface),
                new Dome(3, "Dome 3", 3.0, 3.0, surface));
        return domes;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = List.of(
                new User(1, "joe", "mama", "123 secondstreet", "none"),
                new User(2, "bob", "mama", "123 secondstreet", "standard"),
                new User(3, "rob", "mama", "123 secondstreet", "premium"));
        return users;
    }

    @Override
    public List<Company> getCompanies() {
        List<Company> companies = List.of(
                new Company(1, "company 1", "123 secondstreet", 20, 1),
                new Company(2, "company 2", "123 secondstreet", 40, 2),
                new Company(3, "company 3", "123 secondstreet", 60, 3)
        );
        return companies;
    }

    @Override
    public Company getCompany(int companyId) {
        return new Company(companyId, "company " + companyId, "123 secondstreet", 20, 1);
    }

    @Override
    public List<OxygenLeak> getOxygenLeaks() {
        double surface = 40.3;
        List<OxygenLeak> oxygenLeaks = List.of(
                new OxygenLeak(1, DangerLevel.HIGH,1, "2022-01-01", 2.0, 3.2, new Dome(1, "Dome 1", 1.0, 1.0, surface)),
                new OxygenLeak(2, DangerLevel.MEDIUM,2, "2022-01-01", 6.366, 78.3214, new Dome(1, "Dome 1", 1.0, 1.0, surface)),
                new OxygenLeak(3, DangerLevel.LOW,3, "2022-01-01", -63.666, 47.635, new Dome(1, "Dome 1", 1.0, 1.0, surface))
        );
        return oxygenLeaks;
    }
    @Override
    public List<Appointment> getAppointments() {
        List<Appointment> appointments = List.of(
                new Appointment(1, "2022-01-01", "15:00:00", "location", 2, "sales"),
                new Appointment(2, "2022-01-01", "15:00:00", "location", 6, "developer"),
                new Appointment(3, "2022-01-01", "15:00:00", "location", 3, "sales"),
                new Appointment(4, "2022-01-01", "15:00:00", "location", 4, "sales")
                );
        return appointments;
    }

    @Override
    public Appointment createAppointment(Map<String, String> appointment) {
        return new Appointment(1, appointment.get("date"), appointment.get("time"), appointment.get("topic"), Integer.parseInt(appointment.get("employeeID")), appointment.get("expertise"));
    }

    @Override
    public List<Population> getPopulation() {
        List<Population> population = List.of(
                new Population(1, 34, 100, -951, Colony.MINE),
                new Population(2, 60, 100, -951, Colony.SURFACE),
                new Population(3, 34, 100, -951, Colony.MINE),
                new Population(4, 34, 100, -951, Colony.SPACESTATION),
                new Population(5, 34, 100, -951, Colony.MINE),
                new Population(6, 34, 100, -951, Colony.SURFACE)
        );
        return population;

    }

}

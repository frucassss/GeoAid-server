package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.*;

import java.util.List;
import java.util.Map;

public interface MarsController {
    Quote getQuote(int quoteId);

    Quote createQuote(String quote);

    Quote updateQuote(int quoteId, String quote);

    void deleteQuote(int quoteId);

    List<Dome> getDomes();

    List<User> getUsers();

    List<Company> getCompanies();

    Company getCompany(int companyId);

    List<OxygenLeak> getOxygenLeaks();

    List<Appointment> getAppointments();

    Appointment createAppointment(Map<String, String> appointment);
}

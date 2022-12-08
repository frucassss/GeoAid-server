package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.*;

import java.util.List;

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
}

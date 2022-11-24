package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.Company;
import be.howest.ti.mars.logic.domain.Dome;
import be.howest.ti.mars.logic.domain.Quote;
import be.howest.ti.mars.logic.domain.User;

import java.util.List;

public interface MarsController {
    Quote getQuote(int quoteId);

    Quote createQuote(String quote);

    Quote updateQuote(int quoteId, String quote);

    void deleteQuote(int quoteId);

    List<Dome> getDomes();

    List<User> getUsers();

    List<Company> getCompanies();
}

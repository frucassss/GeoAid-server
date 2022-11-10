package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.Dome;
import be.howest.ti.mars.logic.domain.Quote;

import java.util.ArrayList;

public interface MarsController {
    Quote getQuote(int quoteId);

    Quote createQuote(String quote);

    Quote updateQuote(int quoteId, String quote);

    void deleteQuote(int quoteId);

    ArrayList<Dome> getDomes();
}

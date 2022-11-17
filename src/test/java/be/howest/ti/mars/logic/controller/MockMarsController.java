package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.Dome;
import be.howest.ti.mars.logic.domain.Quote;
import be.howest.ti.mars.logic.domain.User;
import io.vertx.core.Future;
import io.vertx.core.Promise;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

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
         List<Dome> domes = List.of(
                new Dome(1, "Dome 1", 1.0, 1.0),
                new Dome(2, "Dome 2", 2.0, 2.0),
                new Dome(3, "Dome 3", 3.0, 3.0));
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

}

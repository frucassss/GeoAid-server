package be.howest.ti.mars.logic.controller;

import be.howest.ti.mars.logic.domain.Dome;
import be.howest.ti.mars.logic.domain.Quote;
import io.vertx.core.Future;
import io.vertx.core.Promise;

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
        return null;
    }

}

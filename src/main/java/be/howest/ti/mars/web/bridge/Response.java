package be.howest.ti.mars.web.bridge;

import be.howest.ti.mars.logic.domain.*;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import java.util.ArrayList;
import java.util.List;

/**
 * The Response class is responsible for translating the result of the controller into
 * JSON responses with an appropriate HTTP code.
 */
public class Response {

    private Response() {
    }

    public static void sendQuote(RoutingContext ctx, Quote quote) {
        sendOkJsonResponse(ctx, JsonObject.mapFrom(quote));
    }

    public static void sendQuoteCreated(RoutingContext ctx, Quote quote) {
        sendJsonResponse(ctx, 201, JsonObject.mapFrom(quote));
    }

    public static void sendQuoteDeleted(RoutingContext ctx) {
        sendEmptyResponse(ctx, 204);
    }

    public static void sendQuoteUpdated(RoutingContext ctx, Quote quote) {
        sendOkJsonResponse(ctx, JsonObject.mapFrom(quote));
    }

    private static void sendOkJsonResponse(RoutingContext ctx, JsonObject response) {
        sendJsonResponse(ctx, 200, response);
    }

    private static void sendEmptyResponse(RoutingContext ctx, int statusCode) {
        ctx.response()
                .setStatusCode(statusCode)
                .end();
    }

    private static void sendJsonResponse(RoutingContext ctx, int statusCode, Object response) {
        ctx.response()
                .putHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .setStatusCode(statusCode)
                .end(Json.encodePrettily(response));
    }

    public static void sendFailure(RoutingContext ctx, int code, String quote) {
        sendJsonResponse(ctx, code, new JsonObject()
                .put("failure", code)
                .put("cause", quote));
    }

    public static void sendDomes(RoutingContext ctx, List<Dome> domes) {
        List<JsonObject> domeJsons = new ArrayList<>();
        for (Dome dome : domes) {
            domeJsons.add(JsonObject.mapFrom(dome));
        }
        sendOkJsonResponse(ctx, new JsonObject().put("domes", domeJsons));
    }

    public static void sendUsers(RoutingContext ctx, List<User> users) {
        List<JsonObject> userJsons = new ArrayList<>();
        for (User user : users) {
            userJsons.add(JsonObject.mapFrom(user));
        }
        sendOkJsonResponse(ctx, new JsonObject().put("users", userJsons));
    }

    public static void sendCompanies(RoutingContext routingContext, List<Company> companies) {
        List<JsonObject> companyJsons = new ArrayList<>();
        for (Company company : companies) {
            companyJsons.add(JsonObject.mapFrom(company));
        }
        sendOkJsonResponse(routingContext, new JsonObject().put("companies", companyJsons));
    }

    public static void sendCompany(RoutingContext routingContext, Company company) {
        sendOkJsonResponse(routingContext, JsonObject.mapFrom(company));
    }

    public static void sendOxygenLeaks(RoutingContext routingContext, List<OxygenLeak> oxygenLeaks) {
        List<JsonObject> oxygenLeakJsons = new ArrayList<>();
        for (OxygenLeak oxygenLeak : oxygenLeaks) {
            oxygenLeakJsons.add(JsonObject.mapFrom(oxygenLeak));
        }
        sendOkJsonResponse(routingContext, new JsonObject().put("oxygenLeaks", oxygenLeakJsons));
    }
}

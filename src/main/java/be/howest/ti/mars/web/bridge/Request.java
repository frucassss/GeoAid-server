package be.howest.ti.mars.web.bridge;

import be.howest.ti.mars.web.exceptions.MalformedRequestException;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.ValidationHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Request class is responsible for translating information that is part of the
 * request into Java.
 *
 * For every piece of information that you need from the request, you should provide a method here.
 * You can find information in:
 * - the request path: params.pathParameter("some-param-name")
 * - the query-string: params.queryParameter("some-param-name")
 * Both return a `RequestParameter`, which can contain a string or an integer in our case.
 * The actual data can be retrieved using `getInteger()` or `getString()`, respectively.
 * You can check if it is an integer (or not) using `isNumber()`.
 *
 * Finally, some requests have a body. If present, the body will always be in the json format.
 * You can acces this body using: `params.body().getJsonObject()`.
 *
 * **TIP:** Make sure that al your methods have a unique name. For instance, there is a request
 * that consists of more than one "player name". You cannot use the method `getPlayerName()` for both,
 * you will need a second one with a different name.
 */
public class Request {
    private static final Logger LOGGER = Logger.getLogger(Request.class.getName());
    public static final String SPEC_QUOTE_ID = "quoteId";
    public static final String SPEC_QUOTE = "quote";
    private final RequestParameters params;

    public static Request from(RoutingContext ctx) {
        return new Request(ctx);
    }

    private Request(RoutingContext ctx) {
        this.params = ctx.get(ValidationHandler.REQUEST_CONTEXT_KEY);
    }

    public int getCompanyId() {
        return params.pathParameter("userId").getInteger();
    }

    public Map<String, String> getAppointment() {
        Map<String, String> appointmentParms = new HashMap<>();
        try{
            if (params.body().isJsonObject()) {
                appointmentParms.put("date", params.body().getJsonObject().getString("date"));
                appointmentParms.put("time", params.body().getJsonObject().getString("time"));
                appointmentParms.put("topic", params.body().getJsonObject().getString("topic"));
                appointmentParms.put("employee_name", params.body().getJsonObject().getString("employee_name"));
                appointmentParms.put("expertise", params.body().getJsonObject().getString("expertise"));
                return appointmentParms;
            }
            return null;
        } catch (IllegalArgumentException ex) {
            LOGGER.log(Level.INFO, "Unable to decipher the data in the body", ex);
            throw new MalformedRequestException("Unable to decipher the data in the request body. See logs for details.");
        }
    }

    public int getAppointmentId() {
        return params.pathParameter("appointmentId").getInteger();
    }
}

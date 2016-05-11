package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.porsetech.BuildInfo;


/**
 * Created by cekangaki on 5/10/16.
 */
public class HealthController extends Controller {

    public Result check() {
        JsonNode json = Json.newObject()
                            .put("Version", BuildInfo.version());


        return ok(
                json
        );
    }
}

package controllers;

import com.google.gson.JsonElement;
import play.libs.WS;
import play.mvc.Controller;

public class DataController extends Controller {
    public static void getData() {
        String apiUrl = "API";
        WS.HttpResponse response = WS.url(apiUrl).get();

        if (response.success()) {
            JsonElement data = response.getJson();
            System.out.println(data.toString());
            render(data);
        } else {
            flash.error("Failed to retrieve data from the API");
            render();
        }
    }
}

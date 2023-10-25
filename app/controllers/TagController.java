package controllers;

import com.google.gson.JsonElement;
import play.libs.WS;
import play.mvc.Controller;

public class TagController extends Controller {
    public static void getDataContact() {
        String apiUrl = "https://mandrillapp.com/api/1.0/tags/list";
        WS.HttpResponse response = WS.url(apiUrl)
                .setHeader("Content-Type", "application/json")
                .setParameter("Key", "MailChimp API Key")
                .post();

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

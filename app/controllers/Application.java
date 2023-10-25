package controllers;

import play.*;
import play.mvc.*;

import models.*;
import play.mvc.results.Result;

public class Application extends Controller {

    public static void index() {
        render();
    }
}
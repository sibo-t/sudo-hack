package server;

import api.WebApi;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class WebsiteServer {

    /**
     * Configure the server
     */
    public WebsiteServer() {

    }

    /**
     * Run the server for manual testing
     * @param args ignored, no command line args
     */
    public static void main(String[] args) {
        WebApi server = new WebApi();
        server.start(5000);
        server.runApi();
    }

}

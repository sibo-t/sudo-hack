package api;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class WebApi {
    private static final String PAGES_DIR = "/html";
    private Javalin javalin;

    public WebApi() {
        this.javalin = Javalin.create(config -> {
            config.addStaticFiles(PAGES_DIR, Location.CLASSPATH);
        });
    }

    public void runApi(){
        javalin.post("/registration", ctx -> {
            String fullName = ctx.formParam("firstName") + " " + ctx.formParam("lastName");
            String idNumber = ctx.formParam("idNumber");
            String userType = ctx.formParam("userType");
            System.out.println("Message received from " + fullName);
            System.out.println("Subject: " +idNumber);
            System.out.println(userType);
            ctx.redirect("/success.html");
        });
    }

    /**
     * Start the server
     * @param port the port on which to start the server
     */
    public void start(int port) {
        this.javalin.start(port);
    }

    /**
     * Stop the server
     */
    public void stop() {
        this.javalin.close();
        this.javalin.stop();
    }
}

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    get("/", (request, response) -> {
     return new ModelAndView(new HashMap(), "templates/form.vtl");
   }, new VelocityTemplateEngine());
  }
}

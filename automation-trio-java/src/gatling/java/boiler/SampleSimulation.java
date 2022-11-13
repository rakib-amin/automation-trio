package boiler;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class SampleSimulation extends Simulation {
    ChainBuilder browse = exec(http("Page").get("/")).pause(1);
    HttpProtocolBuilder httpProtocol =
            http.baseUrl("YOUR_WEBSITE_GOES_HERE")
                    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .acceptLanguageHeader("en-US,en;q=0.5")
                    .acceptEncodingHeader("gzip, deflate")
                    .userAgentHeader(
                            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0"
                    );

    ScenarioBuilder users = scenario("Users").exec(browse);

    {
        setUp(
                users.injectOpen(rampUsers(1000).during(15))
        ).protocols(httpProtocol).assertions(
                forAll().responseTime().max().lt(1000),
                global().successfulRequests().percent().gt(95.0)
        );
    }
}

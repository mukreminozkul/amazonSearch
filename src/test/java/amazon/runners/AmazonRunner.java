package amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "amazon/step_definitions",
        dryRun = false,
        tags = "@qabeginners"
)
public class AmazonRunner {
}

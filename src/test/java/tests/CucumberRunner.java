package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps", "hooks"},
        features = "src/test/resources/features",
        publish = true,
        stepNotifications = true,
        plugin = {"pretty", "json:build/cucumber.json", "html:cucumber.html"},
        tags = "@Saucedemo"
)
public class CucumberRunner {
}

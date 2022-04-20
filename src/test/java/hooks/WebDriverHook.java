package hooks;

import driver.WebDriverPool;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebDriverHook {

    @Before(value = "@Web")
    public void intializeWebDriver() {
        WebDriverPool.initialize();
    }

    @After(value = "@Web")
    public void destroyWebDriverSession(Scenario scenario) {
        if(scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) WebDriverPool.driver;
            byte[] byteImage = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/jpeg", "failed");
        }

        WebDriverPool.destroy();
    }
}

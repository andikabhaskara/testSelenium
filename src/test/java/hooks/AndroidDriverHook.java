package hooks;

import driver.AndroidDriverPool;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHook {

    @Before(value = "Android")
    public void initializeAndroidDriver() {
        AndroidDriverPool.initialize();
    }

    @After(value = "Android")
    public void destroyAndroidDriver(Scenario scenario) {
        if(scenario.isFailed()) {
            TakesScreenshot takesScreenshot = AndroidDriverPool.androidDriver;
            byte[] byteImage = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/jpeg", "failed");
        }

        AndroidDriverPool.destroy();
    }
}

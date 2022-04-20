package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidDriverPool {

    public static AndroidDriver androidDriver;

    public static void initialize() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

        try {
            androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (
                MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public static void destroy() {
        androidDriver.quit();
    }
}

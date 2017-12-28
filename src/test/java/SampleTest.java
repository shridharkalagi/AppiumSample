import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shridhk on 12/28/17.
 */
public class SampleTest {
    public AppiumDriver driver;
    DesiredCapabilities caps;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
        caps.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir") + "/AndroidCalculator.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

    }

    @Test
    public void SampleTest(){
        driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
        driver.findElement(By.id("com.android2.calculator3:id/digit2")).click();
        driver.findElement(By.id("com.android2.calculator3:id/plus")).click();
        driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
        driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
        driver.findElement(By.id("com.android2.calculator3:id/plus")).click();
        driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
        driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }




}

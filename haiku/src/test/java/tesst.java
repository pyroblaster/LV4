import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class tesst{
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\Panda\\Desktop\\ApiDemos-debug.apk");
        capabilities.setCapability("VERSION", "9.0");
        capabilities.setCapability("deviceName","emulator");
        capabilities.setCapability("platformName","Android");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testCal() throws Exception {

        WebElement e11 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"OS\"]"));
        e11.click();
        WebElement e12 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Morse Code\"]"));
        e12.click();
        WebElement e18 = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"\"]"));
        e18.sendKeys("Res. non verba.");
        WebElement e19 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Vibrate\"]"));
        e19.click();


        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

        WebElement e13 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        e13.click();
        WebElement e14 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Focus\"]"));
        e14.click();
        WebElement e15 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Vertical\"]"));
        e15.click();
        driver.navigate().back();
        driver.navigate().back();
        WebElement e16 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Buttons\"]"));
        e16.click();
        WebElement e17 = driver.findElement(By.xpath("//android.widget.ToggleButton[@content-desc=\"Toggle\"]"));
        e17.click();

        driver.navigate().back();
        driver.navigate().back();
        WebElement e20= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]"));
        e20.click();
        WebElement e21 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"ColorMatrix\"]"));
        e21.click();
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().back();
    }

    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
}

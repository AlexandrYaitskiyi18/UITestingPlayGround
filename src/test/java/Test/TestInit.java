package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import listener.TestListener;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)

public class TestInit {

    WebDriver driver;
    private boolean headless = true;
    private final Logger logger = LogManager.getLogger(TestInit.class);

    @BeforeMethod
    public void newDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(headless);
        DesiredCapabilities capabilities = new DesiredCapabilities(chromeOptions);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "108.0");
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        driver = new RemoteWebDriver(
                URI.create("http://localhost:4444/wd/hub").toURL() ,
                capabilities
        );
        logger.info("----- Start WebDriver -----");

        if (headless==true) {
            Dimension d = new Dimension(1920, 1080);
            driver.manage().window().setSize(d);
        } else {
        driver.manage().window().maximize(); }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/elements");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
        logger.info("----- Close WebDriver -----");
    }


}

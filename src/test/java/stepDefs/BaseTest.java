package stepDefs;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;


    public static WebDriver startUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

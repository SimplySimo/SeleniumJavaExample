package pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public String url = "https:\\www.google.com";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage() {
        webDriver.get(url);
    }

    public WebDriver navigateToBusiness() {
        webDriver.findElement(By.cssSelector("#fsl > a:nth-child(2)")).click();
        return webDriver;
    }
}

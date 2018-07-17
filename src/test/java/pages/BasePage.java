package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    public static WebDriver webDriver;

    public BasePage(WebDriver driver){
        this.webDriver = driver;
    }


    }


package pages;

import bsh.Console;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class BusinessPage extends BasePage {

    public By Text = By.xpath("/html/body/div[1]/section[1]/div[1]/div/div[1]/h1");

   public BusinessPage(WebDriver driver){super(driver);}

   public void highlightElement(){
       String headingText = webDriver.findElement(Text).getText();
       System.out.println(headingText);
   }
}

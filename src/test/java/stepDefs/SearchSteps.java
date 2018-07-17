package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BusinessPage;
import pages.HomePage;

public class SearchSteps {

    HomePage homePage;
    BusinessPage businessPage;
    WebDriver driver;


    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws Throwable {
        driver = BaseTest.startUp();
        homePage = new HomePage(driver);
        homePage.goToHomePage();
    }


    @And("^I navigate to the Business page$")
    public void iNavigateToTheBusinessPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = homePage.navigateToBusiness();
        businessPage = new BusinessPage(driver);
        Thread.sleep(10000);
    }

    @When("^I select the main text$")
    public void iSelectTheMainText() throws Throwable {
        businessPage.highlightElement();

        Thread.sleep(10000);
    }
}


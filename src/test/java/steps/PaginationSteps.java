package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ElarLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class PaginationSteps {

   WebDriver driver = Driver.gerDriver();

   ElarLoginPage elarLoginPage = new ElarLoginPage();

    @When("Validating login functionality with valid credentials")
    public void validating_login_functionality_with_valid_credentials() {
       driver.get(ConfigReader.getProperty("ElarURL"));
    }

    @When("User logged in with username {string} and password {string}")
    public void user_logged_in_with_username_and_password(String username, String password) {
        elarLoginPage.loginInput.sendKeys(username);
        elarLoginPage.passwordInput.sendKeys(password);
        elarLoginPage.loginBtn.click();


    }
    @Then("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        String actual = "You do not have access to the section. Please contact your administrator for access";
        Assert.assertEquals(elarLoginPage.expected.getText(), actual);

    }
    @When("User clicks on companies button it will show tables with companies")
    public void user_clicks_on_companies_button_it_will_show_tables_with_companies() {
      //  wait(ExpectedConditions.elementToBeClickable(elarLoginPage.companyBtn));
        driver.get(ConfigReader.getProperty("ElarURL"));
        elarLoginPage.loginInput.sendKeys("student@mindtekbootcamp.com");
        elarLoginPage.passwordInput.sendKeys("ilovejava");
        elarLoginPage.loginBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elarLoginPage.companyBtn.click();


    }

    @Given("User on table page")
    public void user_on_table_page() {


    }
    @When("User clicks the {string} pagination button")
    public void user_clicks_the_pagination_button(String button ) {
        elarLoginPage.singleArrowBtn.click();

    }
    @Then("User should be on the next page")
    public void user_should_be_on_the_next_page() {


    }



}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ElarCreateCompanyPage;
import utilities.Driver;

public class JDBCProject {


    ElarCreateCompanyPage elarCreateCompanyPage = new ElarCreateCompanyPage();
    @Given("User creates company {string}")
    public void user_creates_company(String company) {

        elarCreateCompanyPage.addCompany.sendKeys(company);

    }

    @When("User validates created company exists")
    public void user_validates_created_company_exists() {

    }
    @When("User changes MC number")
    public void user_changes_mc_number() {


    }
    @Then("User validates if changed MC number exists in the database")
    public void user_validates_if_changed_mc_number_exists_in_the_database() {

    }


}


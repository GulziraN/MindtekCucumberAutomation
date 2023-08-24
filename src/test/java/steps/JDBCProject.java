package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.ElarCreateCompanyPage;
import utilities.Driver;

public class JDBCProject {


    ElarCreateCompanyPage elarCreateCompanyPage = new ElarCreateCompanyPage();
    @Given("User creates company {string}")
    public void user_creates_company(String company) {

        elarCreateCompanyPage.addCompany.sendKeys(company);
        elarCreateCompanyPage.MCNumber.sendKeys("7867410987");
        elarCreateCompanyPage.DOTNumber.sendKeys("7029529529");
        elarCreateCompanyPage.phoneNumber.sendKeys("577290577290");
        elarCreateCompanyPage.street.sendKeys("887 Grant avenue");
        elarCreateCompanyPage.city.sendKeys("Marathon");
        Select select = new Select(elarCreateCompanyPage.dropdownState);
        select.selectByIndex(2);
        elarCreateCompanyPage.zipCode.sendKeys("32937");
        elarCreateCompanyPage.email.sendKeys("jdbc@gmail.com");
        elarCreateCompanyPage.insuranceName.sendKeys("InsuranceName");
        elarCreateCompanyPage.insurancePhone.sendKeys("7728820987");
        elarCreateCompanyPage.producerStreet.sendKeys("6356Wicham Road");
        elarCreateCompanyPage.producerCity.sendKeys("North Beach");
        Select select1 = new Select(elarCreateCompanyPage.producerStateDropdown);
        select1.selectByIndex(3);
        elarCreateCompanyPage.producerZipCode.sendKeys("11992");
        elarCreateCompanyPage.producerEmail.sendKeys("email@gmail.com");
        elarCreateCompanyPage.employeeIdNumber.sendKeys("7465891200");
        elarCreateCompanyPage.addCompany.click();


    }
    @And("User validates following company details:")
    public void userValidatesFollowingCompanyDetails() {

    }

    @Then("user should see created company")
    public void userShouldSeeCreatedCompany() {

    }
    @When("User validates created company exists")
    public void user_validates_created_company_exists() {

    }
    @And("User changes MC number")
    public void user_changes_mc_number() {


    }
    @Then("User validates if changed MC number exists in the database")
    public void user_validates_if_changed_mc_number_exists_in_the_database() {

    }

}


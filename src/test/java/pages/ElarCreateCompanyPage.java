package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElarCreateCompanyPage {


    WebDriver driver;
    public ElarCreateCompanyPage () {
        driver = Driver.gerDriver();
        PageFactory.initElements(driver, this);


    }
   @FindBy (xpath = "//a[@href='#/panel/companies/add']")
   public WebElement addCompany;

    @FindBy (xpath = "//input[@name='company_name']")
    public WebElement nameField;

    @FindBy (xpath = "//input[@name='mc_number']")
    public WebElement MCNumber;

    @FindBy (xpath = "//input[@name='dot_number'] ")
    public WebElement DOTNumber;

    @FindBy (xpath = "(//input[@class='input-phone input-form border disabled-company'])[1]")
    public WebElement phoneNumber;

    @FindBy (xpath = "(//input[@name='address'])[1]")
    public WebElement street;

    @FindBy (xpath = "(//input[@name='city'])[1]")
    public  WebElement city;

    @FindBy (xpath = "//select[@name='state'] ")
    public WebElement dropdownState;


    @FindBy (xpath = "//input[@class='input-form disabled-not-ext border disabled-company lowercase'] --email")
    public WebElement email;

    @FindBy (xpath = "//input[@name='insurance']")
    public WebElement insuranceName;

    @FindBy (xpath = "(//input[@class='input-phone input-form border disabled-company'])[2]")
    public WebElement insurancePhone;

    @FindBy (id= "id_producer_address")
    public WebElement producerStreet;

    @FindBy (id = "id_producer_city ")
    public WebElement producerCity;

    @FindBy (id = "id_producer_state")
    public WebElement producerStateDropdown;

    @FindBy (id = "(//input[@name='zip_code'])[2]")
    public WebElement producerZipCode;

    @FindBy (id = "(//input[@class='input-form disabled-not-ext border disabled-company'])[2]")
    public WebElement producerEmail;

    @FindBy (xpath = "(//input[@type='password'])[1]")
    public WebElement employeeIdNumber;

    @FindBy (xpath = "id_other_licenses ")
    public WebElement dropdownOthers;

    @FindBy (xpath = "//button[@class='confirm-save']")
    public WebElement addCompanyBtn;

    @FindBy (xpath = "//button[@class='btn-search-list']---- search company")
    public WebElement searchCompany;

    @FindBy (xpath = "//input[@placeholder='Search']   --- search input")
    public WebElement searchInput;

    @FindBy (xpath = "(//input[@name='zip_code'])[1]")
    public WebElement zipCode;

}

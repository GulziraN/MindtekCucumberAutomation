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
   @FindBy (xpath = "//a[@class='link-btm-menu']")
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
    public WebElement dropdown;
}

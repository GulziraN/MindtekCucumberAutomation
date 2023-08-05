package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElarLoginPage {

    WebDriver driver;

    public ElarLoginPage (){
        driver = Driver.gerDriver();
        PageFactory.initElements(driver, this );
    }

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginInput;

    @FindBy (id = "id_input_pass")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@class='btn-login']")
    public WebElement loginBtn;

    @FindBy (xpath = "//div/p[contains(text(),'You do not have access to the section. Please contact your administrator for access')]")
    public  WebElement expected;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/aside[1]/nav[1]/ul[3]/li[2]/a[1]/*[name()='svg'][1]")
    public WebElement companyBtn;

    @FindBy (xpath = "//span[contains(text(),'keyboard_arrow_right')]")
    public WebElement singleArrowBtn;
}

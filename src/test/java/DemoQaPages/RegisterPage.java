package DemoQaPages;

import BasePackage.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseSeleniumPage {
    public final String firstName = "Raman";
    public final String lastName = "Hameza";
    public final String userName = "Yoyoshka";
    public final String password = "Test123321@";

    @FindBy(xpath = "//*[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id='userName']")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class='rc-anchor-center-item rc-anchor-checkbox-label']") //найти правильный xpath к капче
    private WebElement captcha;

    @FindBy(xpath = "//*[@id='register']")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='gotoLogin']")
    private WebElement backToLoginButton;


    public RegisterPage() {
        driver.get("https://demoqa.com/register");
        PageFactory.initElements(driver,this);
    }

    public RegisterPage checkAllElements(){
        backToLoginButton.isDisplayed();
        registerButton.isDisplayed();
        firstNameField.isDisplayed();
        lastNameField.isDisplayed();
        userNameField.isDisplayed();
        passwordField.isDisplayed();
        captcha.isDisplayed();
        return this;
    }

    public RegisterPage registerNewUser(){
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        captcha.click();
        registerButton.click();
        return this;
    }
}

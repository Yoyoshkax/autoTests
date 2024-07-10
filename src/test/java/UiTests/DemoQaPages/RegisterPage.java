package UiTests.DemoQaPages;

import UiTests.BasePackage.BaseSeleniumPage;
import UiTests.Helpers.TestValues;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class RegisterPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id='userName']")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class='rc-anchor-center-container']") //найти правильный xpath к капче
    private WebElement captcha;

    @FindBy(xpath = "//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-checked' and @id='recaptcha-anchor']")
    private WebElement checkedCaptcha;

    @FindBy(xpath = "//*[@title='reCAPTCHA']")
    private WebElement captchaFrame;

    @FindBy(xpath = "//*[@id='register']")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='gotologin']")
    private WebElement backToLoginButton;


    public RegisterPage() {
        driver.get("https://demoqa.com/register");
        PageFactory.initElements(driver,this);
    }

    public LoginPage doLogin(){
        backToLoginButton.click();
        return new LoginPage();
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

    public RegisterPage registerNewUser() throws InterruptedException {
        firstNameField.sendKeys(TestValues.firstName);
        lastNameField.sendKeys(TestValues.lastName);
        userNameField.sendKeys(TestValues.userName);
        passwordField.sendKeys(TestValues.password);
        driver.switchTo().frame(captchaFrame);
        captcha.click();
        sleep(5000);
        driver.switchTo().parentFrame();
        registerButton.click();
        return this;
    }

}

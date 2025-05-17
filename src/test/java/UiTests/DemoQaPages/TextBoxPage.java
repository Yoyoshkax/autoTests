package UiTests.DemoQaPages;

import UiTests.BasePackage.BaseSeleniumPage;
import UiTests.Helpers.TestValues;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TextBoxPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='userName']")
    private WebElement fullNameField;

    @FindBy(xpath = "//*[@id='userEmail']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='currentAddress']")
    private WebElement currentAddressField;

    @FindBy(xpath = "//*[@id='permanentAddress']")
    private WebElement permanentAddressField;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='output']")
    private WebElement outputField;

    public TextBoxPage() {
        driver.get("https://demoqa.com/text-box");
        PageFactory.initElements(driver,this);
    }

    public TextBoxPage checkAllTextBoxElements(){
        fullNameField.isDisplayed();
        emailField.isDisplayed();
        currentAddressField.isDisplayed();
        permanentAddressField.isDisplayed();
        submitButton.isDisplayed();
        return this;
    }

    public void fillAndSendTextBox(){
        fullNameField.click();
        fullNameField.sendKeys(TestValues.firstName);
        emailField.click();
        emailField.sendKeys(TestValues.email);
        currentAddressField.click();
        currentAddressField.sendKeys(TestValues.currentAdress);
        permanentAddressField.click();
        permanentAddressField.sendKeys(TestValues.permanentAdress);
        submitButton.click();


    }



}

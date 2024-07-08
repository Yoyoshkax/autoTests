package DemoQaPages;

import BasePackage.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseSeleniumPage {

    public final String userName = "Yoyoshka";
    public final String password = "Test123321@";

    @FindBy(xpath = "//*[@id='userName']")
    private WebElement userField;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath ="//*[@id ='login']")
    private WebElement loginButton;

    @FindBy(xpath ="//*[@id ='NewUser']")
    private WebElement newUserButton;

    public LoginPage() {
        driver.get("https://demoqa.com/login");
        PageFactory.initElements(driver,this);
    }

    public LoginPage auth(){
        userField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
        return this;
    }

}

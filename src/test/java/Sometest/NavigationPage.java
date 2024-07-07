package Sometest;

import BasePackage.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavigationPage extends BaseSeleniumPage {
    List<WebElement> navigationMenuElements;

    @FindBy(xpath = "//*[text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Text Box']")
    private WebElement elementTextBox;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Check Box']")
    private WebElement elementCheckBox;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Radio Button']")
    private WebElement elementRadioButton;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Web Tables']")
    private WebElement elementWebTables;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Buttons']")
    private WebElement elementButtons;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Links']")
    private WebElement elementLinks;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Broken Links - Images']")
    private WebElement elementBrokenLinksImages;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Upload and Download']")
    private WebElement elementUploadAndDownload;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Dynamic Properties']")
    private WebElement elementDynamicProperties;


    public NavigationPage() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver,this);
        this.navigationMenuElements = driver.findElements(By.xpath("//*[@id='myElementXpath']"));
    }

    public NavigationPage checkAllElements(){
        elements.click();
        navigationMenuElements.
                forEach(WebElement::isDisplayed);
        return this;
    }
}

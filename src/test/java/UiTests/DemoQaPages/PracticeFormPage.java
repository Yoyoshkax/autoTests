package UiTests.DemoQaPages;

import UiTests.BasePackage.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BaseSeleniumPage {

    private List<WebElement> elementList;

    @FindBy(xpath = "//*[text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Text Box']")
    private WebElement elementTextBox;

    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id='userEmail']")
    private WebElement userEmailField;

    @FindBy(xpath = "//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//label[@for ='gender-radio-1']")
    private WebElement genderMaleButton;

    @FindBy(xpath = "//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//label[@for ='gender-radio-2']")
    private WebElement genderFemaleButton;

    @FindBy(xpath = "//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//label[@for ='gender-radio-3']")
    private WebElement genderOtherButton;

    @FindBy(xpath = "//*[@id='userNumber']")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//*[@id='dateOfBirthInput']")
    private WebElement birthDateField;

    @FindBy(xpath = "//*[@class='react-datepicker__year-select']//option[@value = '1995']")  //*[@id="react-select-2-option-0"]
    private WebElement birthDateYearValue;

    @FindBy(xpath = "//*[@class='react-datepicker__month-select']//option[@value = '5']")
    private WebElement birthDateMonthValue;

    @FindBy(xpath = "//*[@class='react-datepicker__month-container']//div[@class='react-datepicker__month']//div[text()='18']")
    private WebElement birthDateDayValue;

    @FindBy(xpath = "//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
    private WebElement subjectField;

    @FindBy(xpath = "//*[@id='subjectsInput']")
    private WebElement focusedSubjectField;

    @FindBy(xpath = "//*[@id='react-select-2-option-0']")
    private WebElement subjectValue;

    @FindBy(xpath = "//*[@class='css-xb97g8 subjects-auto-complete__multi-value__remove']")
    private WebElement subjectRemove;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//label[@for='hobbies-checkbox-1']")
    private WebElement hobbiesSport;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//label[@for='hobbies-checkbox-2']")
    private WebElement hobbiesReading;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//label[@for='hobbies-checkbox-3']")
    private WebElement hobbiesMusic;

    @FindBy(xpath = "//label[@class='form-file-label']")
    private WebElement uploadFileByLabel;

    @FindBy(xpath = "//label[@id='uploadPicture']")
    private WebElement uploadFileByButton;

    @FindBy(xpath = "//div[@id='currentAddress-wrapper']//div[@class='col-md-9 col-sm-12']//textarea[@id='currentAddress']")
    private WebElement currentAddressField;

    @FindBy(xpath = "//*[@class=' css-1hwfws3']//div[text()='Select State']")
    private WebElement stateSelectField;

    @FindBy(xpath = "//*[@id='react-select-3-option-0']")
    private WebElement stateSelectValue;

    @FindBy(xpath = "//*[@class=' css-1hwfws3']//div[text()='Select City']")
    private WebElement citySelectField;

    @FindBy(xpath = "//*[@id='react-select-4-option-0']")
    private WebElement citySelectValue;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;






    public PracticeFormPage() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver,this);
        this.elementList = driver.findElements(By.xpath("//*[@id='myElementXpath']"));
    }

    public PracticeFormPage checkAllElements(){
        elementList
                .forEach(WebElement::isDisplayed);
        return this;
    }

    public PracticeFormPage fillAllElements(){
        firstNameField.click();
        firstNameField.sendKeys("Raman");
        lastNameField.click();
        lastNameField.sendKeys("Hameza");
        userEmailField.click();
        userEmailField.sendKeys("Yoyoshka@gmail.com");
        genderMaleButton.click();
        mobileNumberField.click();
        mobileNumberField.sendKeys("123321");
        birthDateField.click();
        birthDateYearValue.click();
        birthDateMonthValue.click();
        birthDateDayValue.click();
        subjectField.click();
        focusedSubjectField.sendKeys("Mat");
        subjectValue.click();
        hobbiesMusic.click();
        currentAddressField.click();
        currentAddressField.sendKeys("Dvornikova Street");
        stateSelectField.click();
        stateSelectValue.click();
        citySelectField.click();
        citySelectValue.click();
        submitButton.click();
//        subjectRemove.click();
        return this;
    }

    public NavigationPage moveToNavigationBarElement(){
        elements.click();
        elementTextBox.click();
        return new NavigationPage();
    }
}

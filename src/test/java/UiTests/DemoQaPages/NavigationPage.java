package UiTests.DemoQaPages;

import UiTests.BasePackage.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage extends BaseSeleniumPage {

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

    @FindBy(xpath = "//*[text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Practice Form']")
    private WebElement practiceForm;

    @FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
    private WebElement alersAndFramesAndWindows;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Browser Windows']")
    private WebElement browserWindows;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Alerts']")
    private WebElement alerts;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Frames']")
    private WebElement frames;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Nested Frames']")
    private WebElement nestedFrames;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Modal Dialogs']")
    private WebElement modalDialogs;

    @FindBy(xpath = "//*[text()='Widgets']")
    private WebElement widgets;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Accordian']")
    private WebElement accordian;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Auto Complete']")
    private WebElement autoComplete;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Date Picker']")
    private WebElement datePicker;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Slider']")
    private WebElement slider;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Progress Bar']")
    private WebElement progressBar;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Tabs']")
    private WebElement tabs;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Tool Tips']")
    private WebElement toolTips;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Menu']")
    private WebElement menu;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Select Menu']")
    private WebElement selectMenu;

    @FindBy(xpath = "//*[text()='Interactions']")
    private WebElement interactions;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Sortable']")
    private WebElement sortable;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Selectable']")
    private WebElement selectable;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Resizable']")
    private WebElement resizable;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Droppable']")
    private WebElement droppable;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Dragabble']")
    private WebElement dragabble;

    @FindBy(xpath = "//*[text()='Book Store Application']")
    private WebElement bookStoreApplication;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Book Store']")
    private WebElement bookStore;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Profile']")
    private WebElement profile;

    @FindBy(xpath = "//*[@class='left-pannel']//div[@class='element-group']//ul[@class='menu-list']//span[text()='Book Store API']")
    private WebElement bookStoreApi;


    public NavigationPage() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver,this);
    }

    public NavigationPage checkElements(){
        elements.click();
        elementTextBox.click();
        elementButtons.click();
        elementCheckBox.click();
        elementLinks.click();
        elementBrokenLinksImages.click();
        elementDynamicProperties.click();
        elementRadioButton.click();
        elementUploadAndDownload.click();
        elementWebTables.click();
        return this;
    }

    public NavigationPage checkForms(){
        forms.click();
        practiceForm.click();
        return this;
    }

    public NavigationPage checkAlertsAndFramesAndWindows(){
        alersAndFramesAndWindows.click();
        browserWindows.click();
        alerts.click();
        frames.click();
        nestedFrames.click();
        modalDialogs.click();
        return this;
    }

    public NavigationPage checkWidgets(){
        widgets.click();
        accordian.click();
        autoComplete.click();
        datePicker.click();
        slider.click();
        progressBar.click();
        tabs.click();
        toolTips.click();
        menu.click();
        selectMenu.click();
        return this;
    }

    public NavigationPage checkInteractions(){
        interactions.click();
        sortable.click();
        selectable.click();
        resizable.click();
        droppable.click();
        dragabble.click();
        return this;
    }

    public NavigationPage checkBookStoreApplication(){
        bookStoreApplication.click();
        login.click();
        bookStore.click();
        profile.click();
        bookStoreApi.click();
        return this;
    }
}

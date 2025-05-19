package UiTests.DemoQaPages;

import UiTests.BasePackage.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Path;

import static java.lang.Thread.sleep;

public class UploadAndDownloadPage extends BaseSeleniumPage {

    public UploadAndDownloadPage() {
        driver.get("https://demoqa.com/upload-download");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='downloadButton']")
    private WebElement downloadButton;

    @FindBy(xpath = "//*[@id='uploadFile']")
    private WebElement uploadFileButton;

    public UploadAndDownloadPage uploadFile() {
        WebElement fileInput = uploadFileButton;
        fileInput.sendKeys("C:\\Users\\astonuser\\Desktop\\КАЙФФ.png");
        System.out.println("File uploaded successfully");
        return this;
    }

    public UploadAndDownloadPage downloadFile() throws InterruptedException {
        downloadButton.click();
        sleep(5000);
        return this;
    }


}

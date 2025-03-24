package UiTests.BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

abstract public class BaseTestForAnimeSwitcher {
    protected WebDriver driver;
    private String url;

    @Before
    public void setUp() throws IOException {
        File file = new File("C:\\Users\\astonuser\\Desktop\\url.txt");
        InputStream input = new FileInputStream(file);
        byte[] buffer = input.readAllBytes();
        url = new String(buffer);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BaseSeleniumPage.setDriver(driver);
        driver.get(url);
    }
}


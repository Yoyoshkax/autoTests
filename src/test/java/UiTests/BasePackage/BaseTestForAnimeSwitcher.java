package UiTests.BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

abstract public class BaseTestForAnimeSwitcher {
    protected WebDriver driver;
    private String url = "https://jut.su/bleeach/season-2/episode-2.html";

    @Before
    public void setUp(){
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


package UiTests.BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


abstract public class BaseTest {
   protected WebDriver driver;

   @Before
   public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
      BaseSeleniumPage.setDriver(driver);
   }

   @After
   public void tearDown(){
      driver.close();
      driver.quit();
   }
}

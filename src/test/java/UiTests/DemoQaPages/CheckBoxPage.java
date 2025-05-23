package UiTests.DemoQaPages;

import UiTests.BasePackage.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBoxPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@title='Expand all']")
    private WebElement buttonExpandAll;

    @FindBy(xpath = "//*[@title='Collapse all']")
    private WebElement buttonCollapseAll;

    public void checkTreeNode(){
        List<WebElement> outputFields = driver.findElements(By.cssSelector("#rct-node rct-node-parent rct-node-expanded ol li"));

        assertEquals(3,outputFields.size());
    }
}

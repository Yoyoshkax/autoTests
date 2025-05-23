package UiTests.Sometest;

import UiTests.BasePackage.BaseTest;
import UiTests.DemoQaPages.CheckBoxPage;
import org.junit.jupiter.api.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest(){
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.checkTreeNode();
    }
}

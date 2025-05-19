package UiTests.Sometest;

import UiTests.BasePackage.BaseTest;
import UiTests.DemoQaPages.TextBoxPage;
import org.junit.jupiter.api.Test;


public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTest() {
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage
                .checkAllTextBoxElements()
                .fillAndSendTextBox();

    }
}

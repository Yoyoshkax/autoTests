package UiTests.Sometest;

import UiTests.BasePackage.BaseTest;
import UiTests.DemoQaPages.*;
import lombok.SneakyThrows;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class FormsTest extends BaseTest {

    @Test
    public void formsTest(){
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage
                .checkAllElements()
                .fillAllElements()
                .moveToNavigationBarElement();

    }

    @Test
    public void navBarTest(){
        NavigationPage navigationPage = new NavigationPage();
        navigationPage
                .checkElements()
                .checkForms()
                .checkAlertsAndFramesAndWindows()
                .checkWidgets()
                .checkInteractions()
                .checkBookStoreApplication();
    }

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.auth();
    }

    @Test
    public void registerNewUser() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage();
        registerPage
                .registerNewUser()
                .doLogin()
                .auth();
    }

    @Test
    @SneakyThrows
    public void uploadFileTest() throws InterruptedException {
        UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage();
        uploadAndDownloadPage
                .uploadFile()
                .downloadFile();
    }
}

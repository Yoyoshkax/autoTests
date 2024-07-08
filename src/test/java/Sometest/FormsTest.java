package Sometest;

import BasePackage.BaseTest;
import DemoQaPages.LoginPage;
import DemoQaPages.NavigationPage;
import DemoQaPages.PracticeFormPage;
import DemoQaPages.RegisterPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormsTest extends BaseTest {

    @Test
    public void formsTest(){
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.checkAllElements().fillAllElements().moveToNavigationBarElement();

    }

    @Test
    public void navBarTest(){
        NavigationPage navigationPage = new NavigationPage();
        navigationPage.checkElements().checkForms().checkAlertsAndFramesAndWindows().checkWidgets().checkInteractions().checkBookStoreApplication();
    }

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.auth();
    }

    @Test
    public void registerNewUser(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.registerNewUser();
    }
}

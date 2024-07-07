package Sometest;

import BasePackage.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormsTest extends BaseTest {

    @Test

    public void formsTest(){
            PracticeFormPage practiceFormPage = new PracticeFormPage();
            practiceFormPage.checkAllElements().fillAllElements();

    }

    @Test
    public void navBarTest(){
        NavigationPage navigationPage = new NavigationPage();
        navigationPage.checkAllElements();
    }
}

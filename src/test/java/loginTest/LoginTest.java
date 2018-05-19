package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {
    @Test
    public void validLogin (){
        loginPage.openPage();
        loginPage.enterLogin("element_5@ukr.net");
        loginPage.enterPass("Q1wertyu");
        loginPage.clickSubmitButton();

        checkAC("Account Page Header is not present", personalAccountPage.isAccountPageHeaderPresent(), true);
    }

    @Test
    public void invalidLogIn (){
        loginPage.userLogin ("element_5@ukr.net","11111111");

        checkAC("Account Page Header should not be present",personalAccountPage.isAccountPageHeaderPresent(),false);
    }

}

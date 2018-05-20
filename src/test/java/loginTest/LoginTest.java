package loginTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import parentTest.ParentTest;

import java.util.concurrent.TimeUnit;

public class LoginTest extends ParentTest {

    @Test
    public void validLogin (){
        homePage.openPage();
        homePage.enterLogin("element_5@ukr.net");
        homePage.enterPass("1326547");
        homePage.clickSubmitButton();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
           e.printStackTrace();
      }


        checkAC("Review button is not present", personalAccHomePage.isReviewButtonPresent(), true);
    }

    @Test
    public void invalidLogIn (){
        homePage.userLogin ("element_5@ukr.net","11111111");

        checkAC("Review button should not be present",personalAccHomePage.isReviewButtonPresent(),false);
    }

}

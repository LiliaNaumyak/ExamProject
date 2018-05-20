package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalAccHomePage extends ParentPage {

    @FindBy (xpath = ".//*[@id='menu']/ul/li[1]/a")
    public WebElement reviewButton;


    public PersonalAccHomePage(WebDriver webDriver) {
        super(webDriver, "/a/");
    }


    public boolean isReviewButtonPresent() {
        return actionsWithOurElements.isElementPresent(reviewButton);
    }

    public void checkReviewButtonIsPresent() {
        Assert.assertTrue("Review Button is not present", isReviewButtonPresent());
    }


}

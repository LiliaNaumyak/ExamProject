package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalAccountPage extends ParentPage{

    @FindBy (xpath = ".//p[@class='account-page-header__text account-page-header__text--welcome'] ")
    public WebElement accountPageHeader;

    public PersonalAccountPage(WebDriver webDriver) {
        super(webDriver, "/uk/my-account");
    }

    public boolean isAccountPageHeaderPresent() {
        return actionsWithOurElements.isElementPresent(accountPageHeader);
    }

    public void checkAccountPageHeaderIsPresent() {
        Assert.assertTrue("Logo Watsons is not present", isAccountPageHeaderPresent());
    }
}

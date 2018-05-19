package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy (xpath = ".//*[@class='header__logo__image']")
    private WebElement logo;

    @FindBy (xpath = ".//*[@class='header__login__welcome-text']")
    private WebElement menuAccount;


    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public boolean isLogoPresent() {
        return actionsWithOurElements.isElementPresent(logo);
    }

    public void checkLogoIsPresent() {
        Assert.assertTrue("Logo Watsons is not present", isLogoPresent());
    }
    public void clickOnMenuAccount() {
        actionsWithOurElements.clickOnElement(menuAccount);
    }



}

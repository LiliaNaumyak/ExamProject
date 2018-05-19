package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageThree extends ParentPage{

    @FindBy(id="prefix")
    public WebElement inputPhoneNumberPrefix;

    @FindBy(id="internationalPrefix")
    public WebElement inputPhoneNumberInternationalPrefix;

    @FindBy(id="mobile")
    public WebElement inputPhoneNumber;

    @FindBy (id="select2-city-container")
    public WebElement selectCity;

    public RegistrationPageThree(WebDriver webDriver) {
        super(webDriver, "/uk/register/stepThree");
    }
}

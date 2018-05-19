package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage {

    @FindBy (id = "j_username")
    public WebElement email;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (id = "password_confirmation")
    public WebElement passwordConfirmayion;

    @FindBy (xpath = ".//*[@class=\"btn btn--primary btn--full-width btn--large\"]")
    public WebElement saveButton;


    public RegistrationPage(WebDriver webDriver) {
        super(webDriver, "/uk/register/stepOne");
    }


}

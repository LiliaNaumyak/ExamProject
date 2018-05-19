package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  ParentPage {

    @FindBy(id="j_username")
    public WebElement inputLogin;

    @FindBy(id="j_password")
    private WebElement inputPass;

    @FindBy (xpath = ".//*[@class='btn btn--primary btn--full-width btn--large']")
    private WebElement buttonSubmit;

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/uk/login");
    }

    public void openPage (){
        try {
            webDriver.get("https://www.watsons.ua/uk/login");
            logger.info("Login page was opened");
        }catch (Exception e){
            logger.error("Can not open LoginPage");
            Assert.fail("Can not open LoginPage");
        }
    }

    public void enterLogin (String login){
        actionsWithOurElements.enterTextIntoElement(inputLogin, login);
    }

    public void enterPass (String pass) {
        actionsWithOurElements.enterTextIntoElement(inputPass, pass);
    }

    public void clickSubmitButton () {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void userLogin(String login, String pass) {
        openPage();
        enterLogin(login);
        enterPass(pass);
        clickSubmitButton();
    }



}

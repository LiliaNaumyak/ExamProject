package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy (xpath = ".//*/div[@class='logo']/span[@class='icon']")
    private WebElement logo;
    @FindBy (xpath = ".//*[@href='http://i.zenmoney.ru/']")
    private WebElement MobileVersionLink;
    @FindBy(name = "login")
    public WebElement ddLogin;
    @FindBy(name = "password")
    private WebElement ddPass;
    @FindBy (xpath = ".//*/input[@id='loginOrRegisterSubmit' and @value='Войти']")
    private WebElement buttonSubmit;
    @FindBy (xpath = ".//*/input[@id='loginOrRegisterSubmit' and @value='Зарегистрироваться']")
    private WebElement buttonRegistration;
    @FindBy (xpath = ".//*[@class='signIn']")
    private WebElement spanEnter;
    @FindBy (xpath = ".//*[@class='signUp']")
    private WebElement spanRegistration;


    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public boolean isLogoPresent() {
        return actionsWithOurElements.isElementPresent(logo);
    }

    public void checkLogoIsPresent() {
        Assert.assertTrue("Logo is not present", isLogoPresent());
    }
    public void clickOnMobileVersionLink() {
        actionsWithOurElements.clickOnElement(MobileVersionLink);
    }

    public void openPage (){
        try {
            webDriver.get("https://zenmoney.ru/");
            logger.info("Home page was opened");
        }catch (Exception e){
            logger.error("Can not open HomePage");
            Assert.fail("Can not open HomePage");
        }
    }

    public void enterLogin (String login){
        actionsWithOurElements.enterTextIntoElement(ddLogin, login);
    }

    public void enterPass (String pass) {
        actionsWithOurElements.enterTextIntoElement(ddPass, pass);
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

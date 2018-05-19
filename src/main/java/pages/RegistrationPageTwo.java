package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageTwo extends  ParentPage{

    @FindBy (xpath = ".//*/span[text()='Пан']")
    public WebElement radioButtonMR;

    @FindBy (xpath = ".//*/span[text()='Пані']")
    public WebElement radioButtonMRS;

    @FindBy (id="firstName")
    public WebElement firstName;

    @FindBy (id="lastName")
    public WebElement lastName;

    @FindBy (id="select2-day-container")
    public WebElement selectDayOfBirth;

    @FindBy (id="select2-month-container")
    public WebElement selectMonthOfBirth;

    @FindBy (id="select2-year-container")
    public WebElement selectYearOfBirth;

    @FindBy (id="memberCardNumber")
    public WebElement inputCardNumber;

    @FindBy (xpath = ".//*[@class='btn btn--primary btn--full-width btn--large']")
    public WebElement saveButton;

    @FindBy (id="select2-day-result-wb1r-02")
    public WebElement selectSecondDayOfBirth;

    @FindBy (id="select2-month-result-0cs4-02")
    public WebElement selectFebruary;

    @FindBy (id="select2-year-result-qsow-1990")
    public WebElement selectMyYearOfBirth;

    @FindBy (xpath = ".//*[@class=\"btn btn--primary btn--full-width btn--large\"]")
    public WebElement saveButtonSecond;


    public RegistrationPageTwo(WebDriver webDriver) {
        super(webDriver, "/uk/register/stepTwo");
    }
}

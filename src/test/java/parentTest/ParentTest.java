package parentTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.PersonalAccHomePage;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;

    protected HomePage homePage;
    protected PersonalAccHomePage personalAccHomePage;


    Logger logger = Logger.getLogger(getClass());

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        homePage = new HomePage(webDriver);
        personalAccHomePage = new PersonalAccHomePage(webDriver);


    }
    @After
    public void tearDown(){
        webDriver.quit();
    }

    protected void checkAC (String message, boolean actualRes, boolean expectedRes){
        if (!(actualRes == expectedRes)) {
            logger.error("AC failed:" + message);
        }
        Assert.assertEquals(message,expectedRes,actualRes);

    }

}

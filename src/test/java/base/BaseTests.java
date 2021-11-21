package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class BaseTests {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        goToHomePage();
        removeCookie();
        //driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }

    @BeforeMethod
    public void goToHomePage() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult iTestResult) {
        if (ITestResult.FAILURE == iTestResult.getStatus()) {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + iTestResult.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private void removeCookie() {
        Cookie cookie = new Cookie.Builder("page_visit_count", "1")
                .domain("https://the-internet.herokuapp.com/").build();
        driver.manage().deleteCookie(cookie);
    }

}

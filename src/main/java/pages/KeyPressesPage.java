package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {

    private WebDriver driver;
    private By target = By.id("target");
    private By result = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterKey(String text) {
        driver.findElement(target).sendKeys(text);
    }

    public void enterPI() {
        enterKey(Keys.chord(Keys.ALT, "p") + " = 3.14");
    }

    public String checkResult() {
        return driver.findElement(result).getText();
    }

}

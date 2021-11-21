package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {

    private WebDriver driver;
    private By loginAlert = By.id("flash");

    SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String CheckAlert() {
        return driver.findElement(loginAlert).getText();
    }
}

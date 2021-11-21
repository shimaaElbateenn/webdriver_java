package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By confirmMsg = By.id("content");

    EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkConfirmMessage() {
        return driver.findElement(confirmMsg).getText();
    }
}

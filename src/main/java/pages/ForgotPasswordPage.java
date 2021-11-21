package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By email = By.id("email");
    private By submitButton = By.id("form_submit");

    ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String emailText) {
        driver.findElement(email).sendKeys(emailText);
    }

    public EmailSentPage clickRetrievePassword() {
        driver.findElement(submitButton).click();
        return new EmailSentPage(driver);
    }
}

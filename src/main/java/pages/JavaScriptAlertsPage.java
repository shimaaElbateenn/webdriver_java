package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By JSAlert = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By JSConfirm = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By JSPrompt = By.xpath("//button[text()=\"Click for JS Prompt\"]");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(JSAlert).click();
    }

    public void triggerJSConfirm() {
        driver.findElement(JSConfirm).click();
    }

    public void triggerPrompt() {
        driver.findElement(JSPrompt).click();
    }

    public void alert_enterText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String checkResultMessage() {
        return driver.findElement(result).getText();
    }

    public void alert_accept() {
        driver.switchTo().alert().accept();
    }

    public String alert_getMessage() {
        return driver.switchTo().alert().getText();
    }

    public void alert_cancel() {
        driver.switchTo().alert().dismiss();
    }
}

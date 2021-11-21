package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHotSpot() {
        WebElement hotSpotElement = driver.findElement(hotSpot);
        Actions action = new Actions(driver);
        action.moveToElement(hotSpotElement).contextClick().perform();
    }

    public String checkAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_accept() {
        driver.switchTo().alert().accept();
    }

}

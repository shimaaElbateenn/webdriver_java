package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By bodyText = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkLeftFrame() {
        switchToEditArea(topFrame);
        switchToEditArea(leftFrame);
        String text = driver.findElement(bodyText).getText();
        switchToMainArea();
        switchToMainArea();
        return text;
    }

    public String checkBottomFrame() {
        switchToEditArea(bottomFrame);
        String text = driver.findElement(bodyText).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditArea(String element) {
        driver.switchTo().frame(element);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}

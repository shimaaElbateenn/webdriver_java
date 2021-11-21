package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String xPathFormat = "//a[contains(text(), '%s')]";
    private By linkExamole2 = By.xpath(String.format(xPathFormat, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(linkExamole2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}

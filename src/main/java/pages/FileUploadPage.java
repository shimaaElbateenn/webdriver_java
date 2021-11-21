package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By submitFile = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setChooseFile(String file) {
        driver.findElement(chooseFile).sendKeys(file);
        setSubmitFile();
    }

    public void setSubmitFile() {
        driver.findElement(submitFile).click();
    }

    public String checkUploadedFiles() {
        return driver.findElement(uploadedFiles).getText();
    }

}

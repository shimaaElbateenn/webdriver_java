package javaScriptAlerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class UploadFileTests extends BaseTests {

    @Test
    public void testUploadFile() {
        FileUploadPage uploadPage = homePage.clickUploadFile();
        uploadPage.setChooseFile("/home/shimaa/Downloads/img.png");
        Assert.assertEquals(uploadPage.checkUploadedFiles(), "img.png", "Invalid Upload");
    }
}

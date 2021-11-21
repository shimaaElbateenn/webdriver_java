package keyPress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyPressTests extends BaseTests {

    @Test
    public void testKeyPress() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterKey("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.checkResult(), "You entered: BACK_SPACEl", "invalid key press");
    }

    @Test
    public void testPI() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPI();
    }
}

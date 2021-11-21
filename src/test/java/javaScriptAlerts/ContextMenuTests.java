package javaScriptAlerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        ContextMenuPage menuPage = homePage.clickContextMenuPage();
        menuPage.clickHotSpot();
        Assert.assertEquals(menuPage.checkAlertText(), "You selected a context menu", "Invalid Alert Message");
        menuPage.alert_accept();
    }

}

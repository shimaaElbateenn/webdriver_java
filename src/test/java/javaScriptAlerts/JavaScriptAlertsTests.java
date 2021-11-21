package javaScriptAlerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class JavaScriptAlertsTests extends BaseTests {

    @Test
    public void testJSAlert() {
        JavaScriptAlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_accept();
        Assert.assertEquals(alertsPage.checkResultMessage(),
                "You successfully clicked an alert",
                "Invalid Trigger");
    }

    @Test
    public void testJSConfirm() {
        JavaScriptAlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerJSConfirm();
        Assert.assertEquals(alertsPage.alert_getMessage(), "I am a JS Confirm", "Invalid Confirm Message");
        alertsPage.alert_cancel();
        Assert.assertEquals(alertsPage.checkResultMessage(), "You clicked: Cancel", "Invalid Result Message");
    }

    @Test
    public void testJSPrompt() {
        String text = "Shimaa";
        JavaScriptAlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_enterText(text);
        alertsPage.alert_accept();
        Assert.assertEquals(alertsPage.checkResultMessage(), "You entered: " + text, "Error");
    }


}

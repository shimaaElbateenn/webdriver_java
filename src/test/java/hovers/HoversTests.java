package hovers;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTests extends BaseTests {

    @Test
    public void testHovers() {
        HoversPage hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption Not Displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Error Title");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Error Link");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Error Link Text");
    }
}

package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

public class FramesTests extends BaseTests {

    @Test
    public void testFrames() {
        FramesPage framesPage = homePage.clickFramesPage();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesPage();
        Assert.assertEquals(nestedFramesPage.checkLeftFrame(), "LEFT", "Wrong Frame");
        Assert.assertEquals(nestedFramesPage.checkBottomFrame(), "BOTTOM", "Wrong Frame");
    }

}

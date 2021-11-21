package horizontalSlider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSlider() {
        HorizontalSliderPage sliderPage = homePage.clickHorizontalSliderPage();

        sliderPage.clickOnSlider();
        sliderPage.setRange("4");

        Assert.assertEquals(sliderPage.checkRange(), "4", "Not Valid Range");


    }
}

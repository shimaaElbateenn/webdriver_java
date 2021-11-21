package dynamicLoading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoadingExample2() {
        DynamicLoadingPage dynamicLoading = homePage.clickDynamicLoading();
        DynamicLoadingExample2Page example2Page = dynamicLoading.clickExample2();
        example2Page.clickStart();
        example2Page.isStartButtonDisplayed();
        Assert.assertEquals(example2Page.chickLoadingText(), "Hello World!", "Invalid Loading");

    }

}

package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample2();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.youtube.com/");
    }

}

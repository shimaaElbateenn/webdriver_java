package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTest extends BaseTests {

    @Test
    public void testDropdown() {
        String option = "Option 1";
        DropdownPage dropdownPage = homePage.clickDropdownPage();
        dropdownPage.selectFromDropdown(option);
        var selectedOptions =  dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect Number Of Selection");
        Assert.assertTrue(selectedOptions.contains(option), "Incorrect Selection");
    }

    @Test
    public void testMultiOptionsDropdown() {
        DropdownPage dropdownPage = homePage.clickDropdownPage();
        dropdownPage.selectMultiOptions();
        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);
        var selectedOptions =  dropdownPage.getSelectedOptions();
        Assert.assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        Assert.assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}

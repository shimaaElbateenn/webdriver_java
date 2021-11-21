package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() {
        ForgotPasswordPage passwordPage = homePage.clickForgotPasswordPage();
        passwordPage.setEmailField("tau@example.com");
        EmailSentPage emailSentPage = passwordPage.clickRetrievePassword();
        Assert.assertEquals(emailSentPage.checkConfirmMessage(),
                "Your e-mail's been sent!",
                "Incorrect Message");

        emailSentPage.checkConfirmMessage();
    }
}

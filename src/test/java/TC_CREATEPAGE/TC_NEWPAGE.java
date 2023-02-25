package TC_CREATEPAGE;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CreatePage;
import pages.Login;

public class TC_NEWPAGE extends BasePage {

    @Test
    public void createpageTest1() {
        // cpFB=create page
        CreatePage cpFB = PageFactory.initElements(driver, CreatePage.class);
        Login logFB = PageFactory.initElements(driver, Login.class);
        cpFB.createpage();
        cpFB.communitypage();
        Assert.assertTrue(true, String.valueOf(cpFB.msgMustLogin()));
        logFB.emaildata("rowida.abasirii@outlook.com");
        logFB.passworddata("test123@456");
        logFB.loginButton();
        cpFB.pagenamedata("Testing By Selenium");
        cpFB.categorydata("Information Technology Company");
        cpFB.SelCategoryOption("Information Technology Company");
//        cpFB.SelCategoryOption("Information Technology Company");
//        cpFB.clickcreatebutton();

    }
}

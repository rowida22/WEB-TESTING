package TC_CREATEPAGE;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CreatePage;

public class TC_NEWPAGE extends BasePage {

    @Test
    public void createpageTest1() {
        // cpFB=create page
        CreatePage cpFB = PageFactory.initElements(driver, CreatePage.class);
        cpFB.createpage();
        cpFB.communitypage();
        Assert.assertTrue(true, String.valueOf(cpFB.msgMustLogin()));
        cpFB.emaildata("rowida.abasirii@outlook.com");
        cpFB.passworddata("test123@456");
        cpFB.loginButton();
        cpFB.pagenamedata("Testing By Selenium");
        cpFB.categorydata("Information Technology Company");
        cpFB.SelCategoryOption("Information Technology Company");
        cpFB.clickcreatebutton();
    }
}

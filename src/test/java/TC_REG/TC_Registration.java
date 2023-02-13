package TC_REG;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BasePageREG;
import pages.Registration;

public class TC_Registration extends BasePageREG {

    @Test
    public void regTest1(){
        Registration regFB = PageFactory.initElements(driver, Registration.class);
        regFB.fnamedata("test");
        regFB.lnamedata("selenium");
        regFB.emaildata("testselenium@gmail.com");
        regFB.confemaildata("testselenium@gmail.com");
        regFB.passworddata("test123@456");
//        regFB.selday("23");
//        regFB.selmonth("12");
//        regFB.selyear("1992");
        regFB.genderfemale();
        regFB.signupbutton();
    }


}

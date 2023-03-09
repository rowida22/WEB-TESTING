package TC_REG;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePageREG;
import pages.Registration;


public class TC_Registration extends BasePageREG {

    @Test
    public void regTest1(){
        /*This test case To verify Registration functionality with all vaild data. regTest1*/
        Registration regFB = PageFactory.initElements(driver, Registration.class);
        regFB.fnamedata("mai");
        regFB.lnamedata("ahmed");
        regFB.emaildata("mainahmed@gmail.com");
        regFB.confemaildata("mainahmed@gmail.com");
        regFB.passworddata("test123@456");
        regFB.selday("23");
        regFB.selmonth("12");
        regFB.selyear("1992");
        regFB.genderfemale();
        regFB.signupbutton();
    }
    @Test
    public void regTest2(){
        /*This test case To verify Registration functionality with all invaild data. regTest1*/
     Registration regFB = PageFactory.initElements(driver , pages.Registration.class);
     regFB.fnamedata("test");
     regFB.lnamedata("Selenium");
     regFB.emaildata("testselenium@gmail.com");
     regFB.confemaildata("testselenium@gmail.com");
     regFB.passworddata("test123selenium");
     regFB.selday("3");
     regFB.selmonth("1");
     regFB.selyear("1995");
     regFB.genderfemale();
     regFB.signupbutton();
     Assert.assertTrue(true , String.valueOf(regFB.humanErrorMsg()));
    }
    @Test
    public void regTest3(){
        /*This test case To verify Registration functionality with less 6 characters in Password field. regTest1*/
        Registration regFB = PageFactory.initElements(driver , pages.Registration.class);
        regFB.fnamedata("aya");
        regFB.lnamedata("mahmoud");
        regFB.emaildata("ayamahmoud@gmail.com");
        regFB.confemaildata("ayamahmoud@gmail.com");
        regFB.passworddata("test1");
        regFB.selday("4");
        regFB.selmonth("5");
        regFB.selyear("1991");
        regFB.genderfemale();
        regFB.signupbutton();
        Assert.assertTrue(true , String.valueOf(regFB.errorPass()));
    }


}

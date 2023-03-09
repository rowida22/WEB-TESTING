package TC_LOGIN;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login;
import pages.WelcomePage;

public class TC_Login extends BasePage {

  //  @Test
//  public void loginTest1(){ //Done
//    /* test with invalid email and password */
//
//    Login logFB = PageFactory.initElements(driver, Login.class);
//    logFB.emaildata("test@123");
//    logFB.passworddata("123456");
//    logFB.loginButton();
//    Assert.assertTrue(String.valueOf(logFB.forgetPass()),true);
//
//  }
//  @Test
//  public void loginTest2(){ //Done
//    /* Test with valid email & password */
//    Login logFB = PageFactory.initElements(driver , Login.class);
//    logFB.emaildata("FAKEDATA");
//    logFB.passworddata("FAKEDATA");
//    logFB.loginButton();
//    logFB.setProfileOption();
////    logFB.setProfileOption();
//  }


//  @Test
//  public void loginTest3(){ //Almost Done
//    /* Test with valid data and try to Add someone */
//    Login logFB = PageFactory.initElements(driver, Login.class);
//    WelcomePage welpg = PageFactory.initElements(driver, WelcomePage.class);
//    logFB.emaildata("FakeData");
//    logFB.passworddata("FakeData");
//    logFB.loginButton();
//    welpg.searchbardata("FakeData");
//    welpg.Enter();
//    welpg.clickViewProfile();
//
//  }

  @Test
  public void loginTest4() { //Never
    /* Test to create a new post */
    Login logFB = PageFactory.initElements(driver, Login.class);
    logFB.emaildata("rowida.abasirii@outlook.com");
    logFB.passworddata("test123@456");
    logFB.loginButton();
//    logFB.clickPost();
//    logFB.clickPost();
    logFB.clickPost();
//    logFB.createpostdata("Blahhhhh");
//    logFB.createpostdata("Hello Guys I am Junior Software Tester");
//    logFB.createpostdata("Hello Guys I am Junior Software Tester");
//    logFB.clickpostbutton();
  }
}




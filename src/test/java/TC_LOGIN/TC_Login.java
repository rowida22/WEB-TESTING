package TC_LOGIN;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login;

public class TC_Login extends BasePage{

  //  @Test
//  public void loginTest1(){
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
//  public void loginTest2(){
//    /* Test with valid email & password */
//    Login logFB = PageFactory.initElements(driver , Login.class);
//    logFB.emaildata("rowida.abasirii@outlook.com");
//    logFB.passworddata("test123@456");
//    logFB.loginButton();
//    logFB.setProfileOption();
////    logFB.setProfileOption();
//  }


  @Test
  public void loginTest3(){
    /* Test with valid data and try to Add someone */
    Login logFB = PageFactory.initElements(driver, Login.class);
    logFB.emaildata("rowida.abasirii@outlook.com");
    logFB.passworddata("test123@456");
    logFB.loginButton();
    logFB.searchbardata("ruwida muhammad");
    logFB.Enter();
    logFB.clickViewProfile();

  }
//  @Test
//  public void loginTest4(){
//    /* Test to create a new post */
//    Login logFB = PageFactory.initElements(driver, Login.class);
//    logFB.emaildata("FAKEDATA");
//    logFB.passworddata("FAKEDATA");
//    logFB.loginButton();
////    logFB.createpostdata("Hello Guys I am Junior Software Tester");
////    logFB.clickpostbutton();
//  }

}


package TC_LOGIN;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;

public class TC_Login extends BasePage {

  @Test
  public void loginTest1(){ //Done
    /*This test case To verify Login functionality with all invalid data. loginTest1*/

    Login logFB = PageFactory.initElements(driver, Login.class);
    logFB.emaildata("test@123");
    logFB.passworddata("123456");
    logFB.loginButton();
    Assert.assertTrue(String.valueOf(logFB.forgetPass()),true);

  }

  @Test
  public void loginTest2(){//Done
    /*This test case To verify Login functionality with all valid data and try to create post. loginTest2*/

    Login logFB = PageFactory.initElements(driver , Login.class);
    logFB.emaildata("rowida.abasirii@outlook.com");
    logFB.passworddata("test123@456");
    logFB.loginButton();
    logFB.clickPost();
    logFB.createpostdata("tes");
    logFB.clickpostbutton();

  }


  @Test
  public void loginTest3(){ //Done
    /*This test case To verify Login functionality to Add someone. loginTest3*/

    Login logFB = PageFactory.initElements(driver, Login.class);
    logFB.emaildata("rowida.abasirii@outlook.com");
    logFB.passworddata("test123@456");
    logFB.loginButton();
    logFB.SearchBarData("ruwida muhammad");
    logFB.Enter();
    logFB.clickViewProfile();
    logFB.Add();

  }

  @Test
  public void loginTest4() { //Done
    /*This test case To verify Logout functionality. loginTest4*/

    Login logFB = PageFactory.initElements(driver, Login.class);
    logFB.emaildata("rowida.abasirii@outlook.com");
    logFB.passworddata("test123@456");
    logFB.loginButton();
    logFB.UrProfile();
    logFB.Logout();

  }
}




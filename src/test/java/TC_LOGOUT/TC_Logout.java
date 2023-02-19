package TC_LOGOUT;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;

public class TC_Logout extends BasePage {

    @Test(dependsOnMethods = "loginTest2")
    public void logoutTest1(){
        Login logout = PageFactory.initElements(driver, Login.class);
        logout.profileoption();
    }




}

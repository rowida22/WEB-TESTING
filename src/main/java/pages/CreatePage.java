package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePage {

    WebDriver driver;

    public CreatePage(WebDriver driver){
        this.driver = driver;
    }

    By clickCreatePage = By.cssSelector("[class='_8esh']");
    By clickCommunityPage = By.cssSelector("[class='_43rm']");

    By MsgMustLogin = By.cssSelector("[class=\"_585r _50f4\"]");

    By emailTextBox = By.name("email");
    By passwordTextBox = By.name("pass");
    By LoginButton = By.name("login");

    public void createpage(){
        driver.findElement(clickCreatePage).click();
    }

    public void communitypage(){
        driver.findElement(clickCommunityPage).click();
    }

    public boolean msgMustLogin(){
        return driver.findElement(MsgMustLogin).isDisplayed();
    }

    public void emaildata(String emailfield){
        driver.findElement(emailTextBox).sendKeys(emailfield);
    }

    public void passworddata(String passfield){
        driver.findElement(passwordTextBox).sendKeys(passfield);
    }

    public void loginButton(){
        driver.findElement(LoginButton).click();
    }

}

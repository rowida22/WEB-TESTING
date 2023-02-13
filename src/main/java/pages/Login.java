package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

   WebDriver driver;

  public Login(WebDriver driver) {
    this.driver = driver;
  }

  By emailTextBox = By.name("email");
  By passwordTextBox = By.name("pass");
  By LoginButton = By.name("login");
//  @FindBy(name = "email") WebElement emailTextBox;
//  @FindBy(name = "pass") WebElement passwordTextBox;
//  @FindBy(name = "login") WebElement  LoginButton;

  By msgError = By.xpath("//*[@id=\"email_container\"]/div[2]");


  public void emaildata(String emailfield){
    driver.findElement(emailTextBox).sendKeys(emailfield);
//    emailTextBox.sendKeys(emailfield);
  }

  public void passworddata(String passfield){
    driver.findElement(passwordTextBox).sendKeys(passfield);
  }
//  public void passworddata( String passfield){
//    passwordTextBox.sendKeys(passfield);
//
//  }

  public void loginButton(){
    driver.findElement(LoginButton).click();
  }
//  public void loginButton(){
//    LoginButton.click();}

  public boolean forgetPass(){
    return driver.findElement(msgError).isDisplayed();

  }


}

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
  By searchBar = By.xpath("//*[@id=\"mount_0_0_5+\"]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div/label/input");

//  By Post = By.xpath("//*[@id=\"mount_0_0_5+\"]/div/div[1]/div/div[6]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div");
//  By createPost = By.cssSelector("[class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']");
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

//  public void setCreatePost(String post){
//    driver.findElement(createPost).sendKeys(post);
////    driver.findElement(Post).click();
//  }

  public void SearchBar(String searchOnAccount){
    driver.findElement(searchBar).sendKeys(searchOnAccount);

  }

  public boolean forgetPass(){
    return driver.findElement(msgError).isDisplayed();

  }


}

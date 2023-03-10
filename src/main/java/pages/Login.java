package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
  By SearchBar = By.xpath("//input[@placeholder=\"Search Facebook\"]");
  By ViewProfile = By.xpath("//a[@href=\"https://www.facebook.com/profile.php?id=100086945332367\"]");
  By AddSomeone = By.cssSelector("[aria-label=\"Add Friend\"]");
  By createPost = By.cssSelector("[class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6\"]");
  By dataPost = By.cssSelector("[class=\"xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8\"]");
  By PostButton = By.cssSelector("[aria-label=\"Post\"]");

  By NewMsg = By.cssSelector("[aria-label=\"New message\"]");

//  By GuyName = By.id("jsc_c_9f");
//  By GuyName = By.cssSelector("[class=\"x193iq5w x6ikm8r x10wlt62 x1ed109x\"]");

  By LogOut = By.cssSelector("[class=\"x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1ey2m1c xds687c xg01cxk x47corl x10l6tqk x17qophe x13vifvy x1ebt8du x19991ni x1dhq9h x1wpzbip\"]");
  By UrProfileLogout = By.cssSelector("[aria-label=\"Your profile\"]");

//  @FindBy(name = "email") WebElement emailTextBox;
//  @FindBy(name = "pass") WebElement passwordTextBox;
//  @FindBy(name = "login") WebElement  LoginButton;

  By msgError = By.xpath("//*[@id=\"email_container\"]/div[2]"); //TC1


//////////////////////
//  Login

  public void emaildata(String emailfield) {
    driver.findElement(emailTextBox).sendKeys(emailfield);
//    emailTextBox.sendKeys(emailfield);
  }

  public void passworddata(String passfield) {
    driver.findElement(passwordTextBox).sendKeys(passfield);
  }

  public void loginButton() {
    driver.findElement(LoginButton).click();
  }

  public boolean forgetPass() { //Error msg of TC1
    return driver.findElement(msgError).isDisplayed();

  }



//  public void setSendMsg(){
//    driver.findElement(sendMsg).click();
//  }
/////////////////////////////////////////////////////////////////
//  Create post
  public void clickPost(){
      driver.findElement(createPost).click();
  }


  public void createpostdata(String Post){
    driver.findElement(dataPost).sendKeys(Post);
  }

  public void clickpostbutton(){
    driver.findElement(PostButton).click();
  }
//////////////////////////////////////////////////////
//  Add someone
  public void SearchBarData(String searchbardata){
    driver.findElement(SearchBar).sendKeys(searchbardata);
  }
  public void Enter(){
    driver.findElement(SearchBar).sendKeys(Keys.ENTER);
  }
  public void clickViewProfile(){
    driver.findElement(ViewProfile).click();
  }

  public void Add(){
    driver.findElement(AddSomeone).click();
  }
  //////////////////////////////////////////////////////////
//  Send Msg
  public void clickSendNewMsg(){
    driver.findElement(NewMsg).click();
  }
//  public void GuyNameData(String Name){
//    driver.findElement(GuyName).sendKeys(Name);
//  }

  //////////////////////////////////////////////////////////
//  LogOut Section

  public void UrProfile(){
    driver.findElement(UrProfileLogout).click();
  }

  public void Logout(){
    driver.findElement(LogOut).click();
  }




}
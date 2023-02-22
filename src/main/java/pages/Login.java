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

  //  Should i put it in Welcomepage?
  By SearchBar = By.xpath("//input[@placeholder=\"Search Facebook\"]");

  By viewProfile = By.cssSelector("[class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"]");

  By sendMsg = By.cssSelector("[class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"]");

//  By ViewProfile = By.cssSelector("[class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"]");

//  By SendMsg = By.cssSelector("[class=\"x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1ey2m1c xds687c xg01cxk x47corl x10l6tqk x17qophe x13vifvy x1ebt8du x19991ni x1dhq9h x1wpzbip\"]");
//  By CreatePost = By.cssSelector("[class='x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe xi81zsa']");
//
//  By PostButton = By.cssSelector("[class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']");

//  @FindBy(name = "email") WebElement emailTextBox;
//  @FindBy(name = "pass") WebElement passwordTextBox;
//  @FindBy(name = "login") WebElement  LoginButton;

  By msgError = By.xpath("//*[@id=\"email_container\"]/div[2]");
  //////////////////////////////////////////////////////////
//  LogOut Section

  By  profileOption = By.cssSelector("[class=\"x1ey2m1c xds687c xg01cxk x47corl x10l6tqk x17qophe x13vifvy x1ebt8du x19991ni x1dhq9h x1wpzbip x14yjl9h xudhj91 x18nykt9 xww2gxu\"]");

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

  public boolean forgetPass() {
    return driver.findElement(msgError).isDisplayed();

  }

  public void searchbardata(String SerachForAcc){
    driver.findElement(SearchBar).sendKeys(SerachForAcc);

  }
  public void Enter(){
    driver.findElement(SearchBar).sendKeys(Keys.ENTER);
  }

  public void clickViewProfile(){
//    driver.findElement(ViewProfile).click();
      driver.findElement(viewProfile).click();
  }

  public void setSendMsg(){
    driver.findElement(sendMsg).click();
  }

//  public void createpostdata(String Post){
//    driver.findElement(CreatePost).sendKeys(Post);
//  }
//
//  public void clickpostbutton(){
//    driver.findElement(PostButton).click();
//  }
  //////////////////////////////////////////////////////////
//  LogOut Section
  public void setProfileOption(){
    driver.findElement(profileOption).click();
  }
}
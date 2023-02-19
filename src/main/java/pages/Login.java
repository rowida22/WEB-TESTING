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

//  By CreatePost = By.cssSelector("[class='x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe xi81zsa']");
//
//  By PostButton = By.cssSelector("[class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']");

//  @FindBy(name = "email") WebElement emailTextBox;
//  @FindBy(name = "pass") WebElement passwordTextBox;
//  @FindBy(name = "login") WebElement  LoginButton;

  By msgError = By.xpath("//*[@id=\"email_container\"]/div[2]");
  //////////////////////////////////////////////////////////
//  LogOut Section

  By ProfileOption = By.xpath("//*[@id=\"mount_0_0_7E\"]/div/div[1]/div/div[2]/div[3]/div[1]/span/div/div[1]/div/div[2]/div/div[1]/svg");

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


//  public void createpostdata(String Post){
//    driver.findElement(CreatePost).sendKeys(Post);
//  }
//
//  public void clickpostbutton(){
//    driver.findElement(PostButton).click();
//  }
  //////////////////////////////////////////////////////////
//  LogOut Section

  public void profileoption(){
    driver.findElement(ProfileOption).click();
  }

}

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

    By PageName = By.id("jsc_c_v");

    By Category = By.cssSelector("[class='x1jx94hy x8cjs6t x1ch86jh x80vd3b xckqwgs x1268tai x1mxuytg x14hpm34 xqvykr2 x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x178xt8z xm81vs4 xso031l xy80clv x78zum5 xdt5ytf x6ikm8r x10wlt62 x1n2onr6 x1ja2u2z x1egnk41 x1ed109x x1a2a7pz']");

    By CreateButton = By.cssSelector("[class= 'x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1ey2m1c xds687c xg01cxk x47corl x10l6tqk x17qophe x13vifvy x1ebt8du x19991ni x1dhq9h x1wpzbip']");
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

    public void pagenamedata(String pagename){
        driver.findElement(PageName).sendKeys(pagename);
    }
    public void categorydata(String category){
        driver.findElement(Category).sendKeys(category);
    }
    public void clickcreatebutton(){
        driver.findElement(CreateButton).click();
    }

}

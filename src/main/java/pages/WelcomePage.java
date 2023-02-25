package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class WelcomePage {


    WebDriver driver;

    public WelcomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    //////////////////////////
//    i think we should cp email and pass
    By SearchBar = By.xpath("//input[@placeholder=\"Search Facebook\"]");

    //*[ contains (text(), ‘Get started’ ) ]
//    By ADD = By.xpath("//*[contains(text(),'Add friend')]");
    By ViewProfile = By.xpath("//a[@href=\"https://www.facebook.com/profile.php?id=100086945332367\"]");
        //    By ADD = By.cssSelector("[class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"]");



    public void searchbardata(String addSomeone){
        driver.findElement(SearchBar).sendKeys(addSomeone);
    }
    public void Enter(){
        driver.findElement(SearchBar).sendKeys(Keys.ENTER);
    }

    public void clickViewProfile(){
        driver.findElement(ViewProfile).click();
    }

//    public void clickAddSomeone(){
//        driver.findElement(ADD).click();
//    }

}

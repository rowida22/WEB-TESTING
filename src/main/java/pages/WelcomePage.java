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
//    By tryLogOut = By.xpath("//*[@id=\"mount_0_0_cG\"]/div/div[1]/div/div[2]/div[3]/div[1]/span/div/div[1]/div/svg/g/circle");

    By tryLogOut = By.className("x1ey2m1c xds687c xg01cxk x47corl x10l6tqk x17qophe x13vifvy x1ebt8du x19991ni x1dhq9h x1wpzbip x14yjl9h xudhj91 x18nykt9 xww2gxu");
    public void SlogOut (){
        driver.findElement(tryLogOut).click();
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

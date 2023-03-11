package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatePage {

    WebDriver driver;

    public CreatePage(WebDriver driver){
        this.driver = driver;
    }

    By clickCreatePage = By.cssSelector("[class='_8esh']");
    By clickCommunityPage = By.cssSelector("[class='_43rm']");

    By MsgMustLogin = By.cssSelector("[class=\"_585r _50f4\"]");
    By PageName = By.cssSelector("[aria-label=\"Page name (required)\"]");

    By Category = By.cssSelector("[aria-label=\"Category (required)\"]");
//    By selCategory = By.xpath("//*[@id=\"1130035050388269\"]/div/div[1]/div/div/div/div");
//    By selCategory = By.xpath("//div[@class='x1yc453h']");
    By selCategory = By.cssSelector("[class=\"x1yc453h\"]");

//    By selCategory = By.xpath("//div[@class=\"x1yc453h\"]");


//    By CreateButton = By.xpath("//spaan[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']");
    By CreateButton = By.xpath("//div[@aria-label=\"Create Page\"]");
    public void createpage(){
        driver.findElement(clickCreatePage).click();
    }

    public void communitypage(){
        driver.findElement(clickCommunityPage).click();
    }

    public boolean msgMustLogin(){
        return driver.findElement(MsgMustLogin).isDisplayed();
    }

    public void pagenamedata(String pagename){
        driver.findElement(PageName).sendKeys(pagename);
    }
    public void categorydata(String category){
        driver.findElement(Category).sendKeys(category);

    }
    public void SelCategoryOption(String Option){
        Select categoryoption = new Select(driver.findElement(selCategory));
        categoryoption.selectByVisibleText(Option);

    }
    public void clickcreatebutton(){
        driver.findElement(CreateButton).click();
    }

}

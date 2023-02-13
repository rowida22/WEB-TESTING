package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration {

    WebDriver driver;

    public Registration(WebDriver driver){
        this.driver = driver;
    }

    By FnameTextBox = By.name("firstname");
    By LnameTextBox = By.name("lastname");
    By EamilTextBox = By.name("reg_email__");
    By ConfemailTextBox = By.name("reg_email_confirmation__");
    By passwordTextBox = By.name("reg_passwd__");

    By selDay = By.id("day");
    By selMonth = By.id("month");
    By selYear = By.id("year");
    By GenderFemale = By.cssSelector("[class='_8esa']");
    By SignupButton = By.cssSelector("[name='websubmit']");

    // may we should put mytouch on it a lil edit
    public void fnamedata(String fname){
        driver.findElement(FnameTextBox).sendKeys(fname);
    }
    public void lnamedata(String lname){
        driver.findElement(LnameTextBox).sendKeys(lname);
    }
    public void emaildata(String email){
        driver.findElement(EamilTextBox).sendKeys(email);
    }
    public void confemaildata(String Confemail){
        driver.findElement(ConfemailTextBox).sendKeys(Confemail);
    }
    public void passworddata(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }

//    public void SelDayMonthYear(int day , int month , int year){
//        driver.findElement(selDay.selectByValue());
//    }
    public void selday(String day){
        Select daydropdown = new Select(driver.findElement(selDay));
        daydropdown.selectByValue(day);
//       selDay.selectByValue(day);
    }
    public void selmonth(String month){
        Select monthdropdown = new Select(driver.findElement(selMonth));
        monthdropdown.selectByValue(month);
//        selMonth.selectByValue(month);
    }
    public void selyear(String year){
        Select yeardropdown = new Select(driver.findElement(selYear));
        yeardropdown.selectByValue(year);
//        selYear.selectByValue(year);
    }
    public void genderfemale(){
        driver.findElement(GenderFemale).click();
    }
    public void signupbutton(){
        driver.findElement(SignupButton).click();
    }

}

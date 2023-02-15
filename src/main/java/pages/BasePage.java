package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage {

  public static WebDriver driver;
  Login login;

   @BeforeClass
   public void setUp() {

    WebDriverManager.chromedriver().driverVersion("109.0.5414.74").setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    driver.navigate().to("https://www.facebook.com/");
    login = new Login(driver);

  }

   @AfterClass
   public void tearDown() {
    driver.quit();

  }

  @AfterMethod
  public void takeScreenShot(){
    File L1img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(L1img, new File("I:\\New folder\\WEB-TESTING\\ScreenShot\\L1img.png"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

  }

}

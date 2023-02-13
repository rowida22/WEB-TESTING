package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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

}

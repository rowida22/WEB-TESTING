package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePageREG {

    public static WebDriver driver;

    Registration Registration;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().driverVersion("110.0.5481.78").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.navigate().to("https://www.facebook.com/signup");
        Registration = new Registration(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

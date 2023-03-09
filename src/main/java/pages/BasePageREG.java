package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePageREG {
    public static WebDriver driver;
    Registration Registration;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.navigate().to("https://www.facebook.com/signup");


        Registration = new Registration(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void takeScreenShot(){
        File R1img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(R1img, new File("I:\\New folder\\WEB-TESTING\\ScreenShot\\R1img.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SamplePage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 2/17/2018.
 */
public class Browser {

    public static WebDriver driver = null;

    public static SamplePage openBrowser(){
        getDriver("browser");
        driver.manage().window().maximize();
        driver.navigate().to(findProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return PageFactory.initElements(driver, SamplePage.class);
    }

    private static String findProperty(String propertyName){
        try {
            InputStream in = new FileInputStream("src\\main\\resources\\browser\\Browser.properties");
            Properties properties=new Properties();
            properties.load(in);
            return properties.getProperty(propertyName);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private static void getDriver(String browserName){
        switch (findProperty(browserName)){
            case "firefox":
                System.setProperty("webdriver.gecko.driver","src\\main\\resources\\browser\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver","src\\main\\resources\\browser\\MicrosoftWebDriver.exe");
                driver= new InternetExplorerDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src\\main\\resources\\browser\\chromedriver.exe");
                driver= new ChromeDriver();
                break;
        }
    }
}

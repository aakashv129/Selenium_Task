package Sample.SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class Selenium_Broser 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        WebElement userName=driver.findElement(By.id("email"));
        WebElement passWord=driver.findElement(By.id("pass"));
        userName.sendKeys("9092037043");
        passWord.sendKeys("aakashdon");
        driver.findElement(By.name("login")).click();
        
        System.setProperty("webdriver.ie.driver", "D:\\chromedriver_win32\\IEDriverServer.exe");  
        WebDriver driver2=new InternetExplorerDriver();  
        driver2.navigate().to("https://www.facebook.com/");
        WebElement userName2=driver2.findElement(By.id("email"));
        WebElement passWord2=driver2.findElement(By.id("pass"));
        userName2.sendKeys("9092037043");
        passWord2.sendKeys("aakashdon");
        
        /*System.setProperty("webdriver.gecko.driver","D:\\chromedriver_win32\\geckodriver.exe" );   
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true);  
        WebDriver driver= new FirefoxDriver(capabilities);  
        driver.navigate().to("https://www.facebook.com/");*/
        
       
        
    }
}

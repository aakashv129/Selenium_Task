package Sample.SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        WebElement fname=driver.findElement(By.xpath("//input[@name='firstName']"));
        fname.sendKeys("Aakash"); 
        WebElement lanme=driver.findElement(By.name("lastName"));
        lanme.sendKeys("Arjun");
        WebElement uname=driver.findElement(By.id("username"));
        uname.sendKeys("aakasharjun");
        WebElement pass1=driver.findElement(By.name("Passwd"));
        pass1.sendKeys("12345678");
        WebElement pass2=driver.findElement(By.xpath(" //input[@name='ConfirmPasswd']"));
        pass2.sendKeys("12345678");
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.partialLinkText("Pri")).click();
	}

}

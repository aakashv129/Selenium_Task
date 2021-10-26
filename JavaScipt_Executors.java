package Sample.SeleniumExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScipt_Executors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://demo.guru99.com/V4/");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;  
        WebElement user=driver.findElement(By.xpath("//input[@name='uid']"));
        WebElement pass=driver.findElement(By.xpath("//input[@onkeyup='validatepassword();']"));
        //setAttribute
        js.executeScript("arguments[0].setAttribute('value','aakash')",user);
        js.executeAsyncScript("window.setTimeout(arguments[0], 5000);");
        js.executeScript("arguments[0].setAttribute('value','hsakaa')",pass);
        //GetAttribute
        Object str=js.executeScript("return arguments[0].getAttribute('value')", user);
        String s=(String)str;
        System.out.println(s);
        //Get Title
        String title =  js.executeScript("return document.title;").toString();
        System.out.println("Title:"+title);
        //innerText
        String text =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(text);
        //Generate Alert
        //js.executeScript("alert('Hello Aakash');");
        Thread.sleep(5000);
        //click
        WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
        js.executeScript("arguments[0].click()",button);
        //Alert Handling
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.close();
	}

}

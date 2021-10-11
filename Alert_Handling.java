package Sample.SeleniumExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(10000);
		
		//accept()
		
		/*WebElement first=driver.findElement(By.xpath("//a[@href='#OKTab']"));
		first.click();
		
		WebElement second=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		second.click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		//dismiss()
		
		/*WebElement first=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		first.click();
		
		WebElement second=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		second.click();
		
		Alert alert=driver.switchTo().alert();
		alert.dismiss();*/
		
		WebElement first=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		first.click();
		
		WebElement second=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		second.click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Aakash");
		String str=alert.getText();
		alert.accept();
		
		System.out.println(str);
		
		Thread.sleep(4000);
		
		driver.close();

	}

}

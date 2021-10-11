package Sample.SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		String url = ("https://www.google.co.in/");  
		driver.get(url);   
		String title = driver.getTitle();   
		int titleLength = driver.getTitle().length();  
		System.out.println("Title of the page is : " + title);  
		System.out.println("Length of the title is : "+ titleLength);     
		String pageSource = driver.getPageSource();      
		System.out.println("Total length of the Page Source is : " + pageSource.length());   
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();   

	}

}

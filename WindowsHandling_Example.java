package Sample.SeleniumExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.navigate().to("https://www.naukri.com/");
    	String parent=driver.getWindowHandle();
    	Set<String> parent_child=driver.getWindowHandles();
    	
    	System.out.println(parent);
    	System.out.println(parent_child);
    	
    	List<String> list=new ArrayList<String>(parent_child);
    	
    	String s1=list.get(1);
    	System.out.println(s1);
    	
    	driver.switchTo().window(s1);
    	
    	//driver.manage().window().maximize();
    	
    	Thread.sleep(10000);
    	
    	driver.close();
    	
    	String s2=list.get(2);
    	System.out.println(s2);
    	
    	driver.switchTo().window(s2);
    	
    	//driver.manage().window().maximize();
    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	
    	driver.switchTo().window(parent);
    	
    	//driver.manage().window().maximize();
    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	
    	

	}

}

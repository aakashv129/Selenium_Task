package Sample.SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
	    WebElement src = driver.findElement(By.id("draggable"));
	    WebElement dest = driver.findElement(By.id("droppable"));
	    Actions action = new Actions(driver);
	    action.dragAndDrop(src,dest).build().perform();
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	    WebDriver driver2=new ChromeDriver();
	    driver2.get("http://demo.guru99.com/test/simple_context_menu.html");
	    WebElement clic=driver2.findElement(By.xpath("//span[text()='right click me']"));
	    WebElement cli=driver2.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions action2 = new Actions(driver2);
	    action2.contextClick(clic).perform();
	    Thread.sleep(10000);
	    action2.doubleClick(cli).build().perform();
	    driver2.close();
	}

}

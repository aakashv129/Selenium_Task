package Sample.SeleniumExample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class_Example_2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement email=driver.findElement(By.xpath("//input[@name='q']"));
        Point p=email.getLocation();
        int i=p.x;
        int j=p.y;
        System.out.println(i+" "+j);
        Robot robot=new Robot();
        robot.mouseMove(i,j);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);*/
        
        driver.manage().window().maximize();
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); 
        Robot robot = new Robot();	
        robot.mouseMove(630, 420); 
        Thread.sleep(5000);      	
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); 
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); 	
        Thread.sleep(3000);
	}

}

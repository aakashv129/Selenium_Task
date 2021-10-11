package Sample.SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement country=driver.findElement(By.name("country"));
        Select sel=new Select(country);
        sel.selectByIndex(10);
        Thread.sleep(5000);
        sel.selectByValue("AL");
        Thread.sleep(5000);
        sel.selectByVisibleText("Algeria");
        Thread.sleep(5000);
        
        WebElement month=driver.findElement(By.name("Month"));
        Select sel2=new Select(month);
        System.out.println(sel2.isMultiple());
        sel2.selectByIndex(0);
        sel2.selectByIndex(1);
        Thread.sleep(5000);
        sel2.deselectAll();
        Thread.sleep(5000);
        List<WebElement> list=sel2.getOptions();
        for(WebElement l:list){
        	System.out.println(l.getText());
        }
        driver.close();
	}

}

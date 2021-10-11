package Sample.SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		
		//Column_Size
		List<WebElement> column=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		int col_size=column.size();
		System.out.println(col_size);
		
		//Row_Size
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		int row_size=rows.size();
		System.out.println(row_size);
		
		//To Select a particular row
		WebElement particular=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[6]"));
		String text=particular.getText();
		System.out.println(text);
		
		//To Select a particular Cell
		WebElement cell = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
	    String text_2 = cell.getText();
	    System.out.println("Cell value is : " + text_2); 
	    
		driver.close();
		
		

	}

}

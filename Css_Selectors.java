package Sample.SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        WebElement fname=driver.findElement(By.cssSelector("input#firstName"));
        fname.sendKeys("Aakash"); 
        //By Tag and Id
        //By Tag and Class
        WebElement lname=driver.findElement(By.cssSelector("input[name=lastName]"));
        lname.sendKeys("Arjun");
        //driver.findElement(By.cssSelector("input[id=lastName]")).sendKeys("Arjun");
        //Tag and Attribute
        //driver.findElement(By.cssSelector("tag.class[attribute=value]"))  
        Point p=lname.getLocation();
        System.out.println(p.x+" "+p.y);
        System.out.println(fname.isEnabled());
        System.out.println(lname.getTagName());
        System.out.println(lname.getText());
        driver.close();

	}

}

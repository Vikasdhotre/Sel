package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	//Question->how will u send keys in selenium??
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement link=driver.findElement(By.xpath("//input[@name='email']"));
		
		String enterdata="Naresh@gamai.com";
		
		js.executeScript("arguments[0].value='Naresh@gamail.com';", link);
		
	}

}

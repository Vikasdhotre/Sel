package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) throws InterruptedException
	{
		//interface variable=keyword class constructor();
		WebDriver driver=new ChromeDriver();
		
		//variable.method(url);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	
		driver.findElement(By.name("cusid")).sendKeys("2344");
		Thread.sleep(3000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
		
		
		
		
		
		driver.quit();
		
		
		
		
	}

}

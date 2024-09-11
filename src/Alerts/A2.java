package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);;;;
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		driver.switchTo().alert().accept();

		//Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		     
		


	}

}

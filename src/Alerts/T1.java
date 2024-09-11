package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class T1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(5000);
		
		 //div[contains(text(),'ht-devise-page__content')]
		//1 alert
		//driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		//driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		//driver.findElement(By.id("alertButton")).click();

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2 alert
		driver.findElement(By.id("timerAlertButton")).click();

		//driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		//3
		driver.findElement(By.id("confirmButton")).click();

		//driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
		
		
		//4
		driver.findElement(By.id("promtButton")).click();
           
		//driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		//driver.switchTo().alert().sendKeys("iam alert box");
		Alert promptAlert  = driver.switchTo().alert();
		Thread.sleep(4000);
		promptAlert.sendKeys("Accepting the alert");
		promptAlert.accept();
		Thread.sleep(2000);
		//driver.quit();
		

	}

}

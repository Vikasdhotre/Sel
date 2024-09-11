package Waits_in_Selinum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {
	public static void main(String args[] ){
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@name='login']"));
		
//		wait.until(ExpectedConditions.elementToBeClickable("link"));
//		link.click();
		
		WebElement link= driver.findElement(By.xpath("//button[@name='login']"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(link));
		
		link.click();
		
		
	}

}

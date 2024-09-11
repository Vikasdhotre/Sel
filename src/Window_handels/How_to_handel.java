package Window_handels;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_handel {
	
	//Question-ow we will handle window handling in selenium java???
	
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(4000);
		System.out.println(parentwindow);
		
		//driver.findElement(By.xpath("//span[text()='Remote']")).click();
		
	driver.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[1]/a[1]/span ")).click();
		
	Set<String> allwindows=driver.getWindowHandles();
		
		System.out.println(allwindows);
		//allwindow---naukuri and remotewindow
		
		for(String currentwindow:allwindows)
		{
			if(!currentwindow.equals(parentwindow))
			{
				driver.switchTo().window(currentwindow);
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//span[text()='Work from office'] ")).click();
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		driver.close();
		
		
		
		
		
	}

}

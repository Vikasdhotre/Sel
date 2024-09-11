package Window_handels;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandels {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("https://www.naukri.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	String parentWin = driver.getWindowHandle();//testing purpose
	System.out.println(driver.getTitle() + "---" + parentWin + "::::" + driver.getCurrentUrl());//testing purpose
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,'200');");
	WebElement remoteBtn = driver.findElement(By.xpath("//div[@id='trending-naukri-wdgt']/div[1]/div[1]/a[1]"));//Reusable
	js.executeScript("arguments[0].click();",remoteBtn);
	Thread.sleep(3000);
	String childWin = driver.getWindowHandle();//testing purpose
	Set<String> set = driver.getWindowHandles();
	System.out.println("total windos :" + set);
	for (String allWindows : set) {
		if (!allWindows.equals(parentWin)) {
			driver.switchTo().window(parentWin);
			driver.findElement(By.xpath("/ /div[@id='trending-naukri-wdgt']/div[1]/div[1]/a[2]")).click();
			Thread.sleep(3000);
		}
	}
	driver.switchTo().window(childWin);
	Set<String> set2 = driver.getWindowHandles();//testing purpose
	System.out.println("total windows :" + set2);//testing purpose
	driver.quit();
}
}


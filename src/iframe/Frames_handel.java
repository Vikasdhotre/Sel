package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_handel {

	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]")).click();
	}
}

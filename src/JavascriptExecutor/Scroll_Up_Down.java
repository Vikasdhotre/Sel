package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll_Up_Down {

	//Question->how u will scroll up and down??
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
	
		//down karne ke liye iska use karo
		js.executeScript("window.scrollBy (0,1000)");
		
		Thread.sleep(5000);
		
		//up karne ke liye iska use karo
		js.executeScript("window.scrollBy (0,-1000)");
	}

}

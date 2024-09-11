package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_view_and_click {

	// how to scrollto view and click any webelement?
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		//interface variabl = (typecasting) interface;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement link = driver.findElement(By.xpath("//span[text()='Scalable Cloud']"));

		// js.executeScript("scrollTo(0,'4000');");
		// js.executeScript("window.scrollBy (0,3000)");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='160%'");
		// js.executeScript("window.scrollBy (0,document.body.scrollHight);");//not clear
		// js.executeScript("arguments[0].scrollIntoView();",link);
		// js.executeScript("arguments[0].click();",link);
	}
}

package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//li[@data-id='5']"));
		WebElement destination=driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		WebElement source1=driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement destination1=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		
		
		Actions Act= new Actions(driver);
		Act.dragAndDrop(source, destination).build().perform();
		
		
	}

}

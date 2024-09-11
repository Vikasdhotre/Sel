package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton_1 {
	public static void main(String[]args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://demo.guru99.com/test/radio.html");
		
		List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println(radiobuttons.size());
		
		for(int i=0;i<=radiobuttons.size()-1;i++)
		{
			System.out.println(radiobuttons.get(i).getAttribute("value"));
		}
		driver.quit();
		
	}
}

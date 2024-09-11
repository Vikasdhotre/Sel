package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch_2 {
	
	//Question-how to click single checkkbox
	public static void main(String[]args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		
		for(int i=0;i<=checkboxes.size()-1;i++) {
			//System.out.println(checkboxes.get(i).getAttribute("value"));
			
			if((checkboxes.get(i).getAttribute("value").equals("checkbox2")))
			{
				checkboxes.get(i).click();
				System.out.println("checkbox 2 is click :  "+checkboxes.get(i).getAttribute("value") );
			}
		}
		driver.quit();
		
		
	}

}

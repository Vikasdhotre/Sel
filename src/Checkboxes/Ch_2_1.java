package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch_2_1 {
	
	//Question-multiple check boxes to check
	public static void main(String[]args) {
		
		ChromeDriver driver= new ChromeDriver();

		driver.navigate().to("https://demo.guru99.com/test/radio.html");

	List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkboxes.size());

	for( int i=0;i<=checkboxes.size()-1;i++)
	{
		//iska use sirf box ke names or size print karne ke liye use hota hai
		//System.out.println(checkboxes.get(i).getAttribute("value"));
		
		//ye wala method use karke sabhi checkbox ko click kar sakate hai
		//checkboxes.get(i).click();
		
		//iska use ham jo hame chbox chahiye oo condition likh ke use kar sakate hai
		if((checkboxes.get(i).getAttribute("value").equals("checkbox3")) ||(checkboxes.get(i).getAttribute("value").equals("checkbox2")))
		{
			checkboxes.get(i).click();
		}
		
		}
	
	}

}

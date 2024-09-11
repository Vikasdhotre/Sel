package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {
//@BeforeMethod
	public void abs()
	{
		ChromeDriver driver= new ChromeDriver();
		 driver.get("https://tablepress.org/demo/");
		 driver.manage().window().maximize();
		 
		 List<WebElement>data=driver.findElements(By.xpath("//tbody[@class='row-hover']//td"));
		 System.out.println(data.size());
		 
		 for(WebElement ele:data)
		 {
			 String value=ele.getText();
			 System.out.println(value);
			 if(value.contains("Reeves"))
			 {
				 
			 }
		 }
		 driver.quit();
	}

}

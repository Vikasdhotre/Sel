package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.navigate().to("http://testingmasters.weebly.com/webtables.html");
		Thread.sleep(4000);
	List<WebElement> allinks=driver.findElements(By.xpath("//table[@id='VisitingTable']//tbody//tr//td[5][text()='Analyst']//preceding-siblling::td[3]"));

	for(int i=0;i<=allinks.size()-1;i++)
	{
		System.out.println(allinks.get(i).getText());
	}

	}
	
}

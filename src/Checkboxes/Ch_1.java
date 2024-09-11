package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch_1 {

	// Question- count and display the names of checkbox:-??
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/radio.html");

		List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(Checkboxes.size());

		for (int i = 0; i <= Checkboxes.size() - 1; i++) {
			System.out.println(Checkboxes.get(i).getAttribute("value"));
		}
		//driver.quit();

	}

}

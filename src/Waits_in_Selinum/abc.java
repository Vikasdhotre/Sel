package Waits_in_Selinum;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abc {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//compulsary wait till 5 sec
		WebElement btn = driver.findElement(By.xpath("//button"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btn));//wait till condition pass
		driver.get("https://www.facebook.com/");


		WebElement link = driver.findElement(By.xpath("//button[@name='login']"));

		wait.until(ExpectedConditions.elementToBeClickable(link));

		link.click();

	}

}

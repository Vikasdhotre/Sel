package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seliniumprogram {

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
Runtime.getRuntime().exec("C:\\Users\\nit\\Documents\\finalcode2.exe");


	}

}

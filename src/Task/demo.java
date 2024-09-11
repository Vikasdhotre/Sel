package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Contact']")).click();
	driver.findElement(By.xpath("//*[text()='Contact Email:']//following::input[1]")).sendKeys("sdjfhjskd");
}
}

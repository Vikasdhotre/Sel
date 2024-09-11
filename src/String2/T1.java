package String2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");//https://tablepress.org/demo/
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.id("addNewRecordButton")).click();
		//driver.findElement(By.id("addNewRecordButton")).click();
		//driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("vikas");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("patil");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("vikas@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("age")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.id("salary")).sendKeys("25000");
		Thread.sleep(2000);
		driver.findElement(By.id("department")).sendKeys("QA");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();

		int count = 0;

		//List<WebElement> data1 = driver.findElements(By.xpath("//div[@class='rt-tbody']"));////div[@class='ReactTable -striped -highlight']//div[@class='rt-td']
		//System.out.println(data1.size());
		

		List<WebElement> data1 = driver.findElements(By.xpath("//div[@class='ReactTable -striped -highlight']//div[@class='rt-td']"));
		System.out.println(data1.size());
			
		//int count=0;
		
		for(int i=0; i<= data1.size()-1;i++){
		{
			System.out.println(data1.get(i).getText() + "\t");
			//count++;
		}
		
		}
		WebElement ele= driver.findElement(By.xpath("(//div [@class='rt-tr-group'])[4]"));   
        String text = ele.getText();                                                         
        if (text.contains("vikas") && text.contains("patil") && text.contains("vikas@gmail.com")    
            && text.contains("QA") && text.contains("25") && text.contains("25000")) {          
            System.out.println(" \n---> Hey "+"*"+ "vikas" + "patil" +"*"+  " your ROW DATA is CORRECT and has been VALIDATED <---");
        } else {
            System.out.println("\n---> Hey "+"*"+ "vikas" + "patil" +"*"+ " your ROW DATA is NOT CORRECT and has been VALIDATED <---");
       
   }
	
		}
}



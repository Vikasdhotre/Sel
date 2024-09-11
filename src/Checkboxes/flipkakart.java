package Checkboxes;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class flipkakart {
	
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo&otracker=categorytree&p%5B%5D=facets.ideal_for%255B%255D%3DGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBoys&p%5B%5D=facets.ideal_for%255B%255D%3DBoys%2B%2526%2BGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BBoys%2B%2526%2BBaby%2BGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BBoys&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BGirls&otracker=nmenu_sub_Baby%20%26%20Kids_0_Kids%27%20Clothing&fm=neo%2Fmerchandising&iid=M_dbaa540b-800a-4df8-ac55-bab6a9c2a592_1_372UD5BXDFYS_MC.0QYFBACHTZGW&otracker=hp_rich_navigation_9_1.navigationCard.RICH_NAVIGATION_Fashion~Kids_0QYFBACHTZGW&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_9_L1_view-all&cid=0QYFBACHTZGW ");
		
		List<WebElement> Checkboxes=driver.findElements(By.xpath("//div[text()='Brand']/parent::div/parent::section//input[@type='checkbox']/parent::label/div[1] "));
		
		System.out.println(Checkboxes.size());
		
		Thread.sleep(6000);
		
		for(int i=0;i<=Checkboxes.size()-1;i++) {
			Checkboxes.get(i).click();
			Thread.sleep(3000);
		}
		
		driver.quit();
		
		
		
		
	}

}

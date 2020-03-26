package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About_Page {
	
	// //a[@href='https://saucelabs.com/']\
	WebDriver dr;

	
	public About_Page(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void link_for_aboutpage() {
		System.out.println("link clicekd");
		dr.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		
		
	}
	
	public void About_Saucedemo() throws InterruptedException {
		
		Thread.sleep(100);
		dr.findElement(By.xpath("//nav[@class='bm-item-list']//child::a[2]")).click();
		
	}
	public void any_btn()
	{
		// //div[@class='content-container']//following::a[1]
		dr.findElement(By.xpath(" //div[@class='content-container']//following::a[1]")).click();
		
	}

}

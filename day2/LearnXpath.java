package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		   driver.get("http://leaftaps.com/opentaps");
		  driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']]")).click();
		 driver.findElement(By.xpath("//a[Contains(text()='CRM')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 
	}

}

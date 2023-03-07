package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

public static void main(String[] args) throws InterruptedException {
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(options);

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://in.bookmyshow.com/");
driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Chennai");
driver.findElement(By.xpath("//strong[text()='Chennai']")).click();
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//div[text()='Dada']")).click();
System.out.println("movie tickets");
driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
driver.findElement(By.xpath("//div[contains(@class,'dropdown highlighted')]")).click();
String text=driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
System.out.println(text);
driver.findElement(By.xpath("//div[text()='INFO']")).click();
String text2=driver.findElement(By.xpath("//div[text()='Available Facilities']")).getText();
System.out.println(text2);
Thread.sleep(2000);
if(text2.contains("parking")) {
	System.out.println("parking slot available");
}
else {
	System.out.println("parking slot not available");
	
}
driver.findElement(By.xpath("//div[@class='cross-container']")).click();
driver.findElement(By.xpath("//div[text()[normalize-space()='10:20 PM']]")).click();
driver.findElement(By.id("btnPopupAccept")).click();
driver.findElement(By.id("pop_1")).click();
driver.findElement(By.id("proceed-Qty")).click();
driver.findElement(By.xpath("//a[@class='_available _selected']")).click();
String text3=driver.findElement(By.xpath("//span[@id='btnSTotal_reserve']")).getText();
System.out.println("Sub total is :" +text3);
}

	

}

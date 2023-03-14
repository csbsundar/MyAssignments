package Marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {
	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://dev57553.service-now.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("5$dJ*EFdhhW0");
	driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
	Shadow dom=new Shadow(driver);
	dom.setImplicitWait(20);
	dom.findElementByXPath("//div[text()='All']").click();
	dom.setImplicitWait(10);
	dom.findElementByXPath("//span[text()='Service Catalog']").click();
	WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame);
	dom.setImplicitWait(20);
	dom.findElementByXPath("//h2[contains(text(),'Mobiles')]").click();
	dom.setImplicitWait(10);
	dom.findElementByXPath("//strong[text()='Apple iPhone 6s']").click();		
	WebElement select = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
	Select dd=new Select(select);
	dd.selectByVisibleText("Gold");
	WebElement select1 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]"));
	Select dd1=new Select(select1);
	dd1.selectByValue("onetwentyeight");
	driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	//String order = driver.findElement(By.xpath("//dl[@class='dl-horizontal sc-dl-horizontal/dt']")).getText();
	String title = driver.getTitle();
	System.out.println(title);
	
	String reqNum = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
	System.out.println(reqNum);


}
}

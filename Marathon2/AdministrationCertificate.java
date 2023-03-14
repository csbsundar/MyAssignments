package Marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministrationCertificate {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow dom = new Shadow(driver);
		dom.findElementByXPath("//span[text()='Learning']").click();
		WebElement trail = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		WebElement sales = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(trail).perform();
		act.scrollToElement(sales).click(sales).perform();
		driver.findElement(By.xpath("//div[@class='credentials-card_title']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		List<WebElement> courses = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for(WebElement i:courses) {
			String text = i.getText();
			System.out.println(text);
		}
		driver.quit();

	}
}
	

		
		


package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonBag {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='American Tourister']")).click();
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		String text2 = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(text3);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}



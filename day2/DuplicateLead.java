package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
 driver.findElement(By.id("password")).sendKeys("crmsfa");
 driver.findElement(By.className("decorativeSubmit")).click();
 driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("Create Lead")).click();
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACCENTURE");
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sundar");
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("c");
 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sundar");
 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
 driver.findElement(By.id("createLeadForm_description")).sendKeys("Trainee");
 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("csb26@gmail.com");
 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select d1= new Select(state);
	d1.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	System.out.println("the title is : "+driver.getTitle());
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SAM");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println("the title is : "+driver.getTitle());
	Thread.sleep(2000);
	}

}



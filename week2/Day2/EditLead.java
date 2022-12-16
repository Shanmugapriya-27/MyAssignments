package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//Thread.sleep(10000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jana");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("The title is present");
			
		}else
			System.out.println("The title is not present");
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLead");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String eleCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(eleCompanyName.contains("TestLead")) {
			System.out.println("The companyname is present");
			
		}else
			System.out.println("The companyname is not present");
		driver.close();
		
	}

}

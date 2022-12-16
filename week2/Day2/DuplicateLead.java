package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("shanmugapriya.mickey@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String eleLeadname = driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[2]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		if(driver.getTitle().contains("Duplicate Lead")) {
			
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			 String eleExpectedName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			if(eleExpectedName.equals(eleLeadname)) {
				System.out.println("Name is correct");
			}else{
				System.out.println("Name is wrong");
				
			}
			driver.close();
		}
		

	}

}

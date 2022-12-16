package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9176");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String eleLeadID = driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]")).getText();
		//driver.findElement(By.xpath("(//td[contains(@class,'cell-first')])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(eleLeadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String elePagingInfo = driver.findElement(By.className("x-paging-info")).getText();
		if(elePagingInfo.equalsIgnoreCase("No records to display")) {
			System.out.println("No records to display");
		}else
			System.out.println("record present");
		driver.close();
	}
	
		
}

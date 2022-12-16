package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		Thread.sleep(10000);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Shanmuga");
		driver.findElement(By.id("lastNameField")).sendKeys("priya");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Shanmu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("priya");
		driver.findElement(By.name("departmentName")).sendKeys("IBT");
		driver.findElement(By.name("description")).sendKeys("Graduate");

		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("shan7@gmail.com");
		Select eleState = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		eleState.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("imp");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String eletitle = driver.getTitle();
		System.out.println(eletitle);
		driver.close();
	}

}

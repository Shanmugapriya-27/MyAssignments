package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("shanmuga");
		driver.findElement(By.name("lastname")).sendKeys("shanmuga");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9363449940");
		driver.findElement(By.id("password_step_input")).sendKeys("Srinivas@98");
		Select idate = new Select(driver.findElement(By.name("birthday_day")));
		idate.selectByValue("15");
		Select sMonth = new Select(driver.findElement(By.name("birthday_month")));
		sMonth.selectByVisibleText("Mar");
		Select iYear = new Select(driver.findElement(By.name("birthday_year")));
		iYear.selectByValue("1996");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		
		

	}

}

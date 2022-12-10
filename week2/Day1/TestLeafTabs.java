package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafTabs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Demosalesmanager");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("crmsfa");
		WebElement btnlogin = driver.findElement(By.className("decorativeSubmit"));
		btnlogin.click();
		WebElement btnlogout = driver.findElement(By.className("decorativeSubmit"));
		btnlogout.click();
		driver.close();
		
		
		

	}

}

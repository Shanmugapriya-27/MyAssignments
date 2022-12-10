package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Testleaf$321");
		WebElement btnLogin = driver.findElement(By.id("Login"));
		btnLogin.click();
	}

}

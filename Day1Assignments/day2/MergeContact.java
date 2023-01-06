package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> getwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(getwindow.get(1));
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(getwindow.get(0));
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::a")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> getwindow1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(getwindow1.get(1));
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(getwindow1.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
	}

}

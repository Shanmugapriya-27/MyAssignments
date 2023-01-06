package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows*/
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"))).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();

		if(driver.getTitle().contains("L'Oreal Paris")) {
			System.out.println("The title is present");
		}else
			System.out.println("The title is not present");

		driver.findElement(By.xpath("(//*[local-name()='svg' and @class='arrow-icon'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div[@class='control-indicator radio ']")).click();

		//Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(5000);
		//Thread.sl
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> openWindowHandles = new ArrayList<String>(windowHandles); 
		driver.switchTo().window(openWindowHandles.get(1));
		Select ml = new Select(driver.findElement(By.xpath("//select[@title='SIZE']")));
		ml.selectByVisibleText("175ml");
		//span[text()='MRP:']/following::span[@class='css-1jczs19']
		String MRP = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText().substring(1);
		System.out.println(MRP);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='css-acpm4k']")));
		
		String GrandTotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText().substring(1);
		System.out.println(GrandTotal);
		int ActualGrandtotal = Integer.parseInt(GrandTotal);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		String PriceDetails = driver.findElement(By.xpath("//p[text()='Price Details']/following::p[@class='css-cla92e eka6zu20']")).getText().substring(1);
		System.out.println(PriceDetails);
		int ActualPriceDetails = Integer.parseInt(PriceDetails);
		if(ActualPriceDetails==ActualGrandtotal) {
			System.out.println("Price correct");
		}else
			System.out.println("Price incorrect");
		driver.quit();


	}

}

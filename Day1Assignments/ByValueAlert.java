package week4.Day1Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ByValueAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
				
		
		driver.findElement(By.xpath("(//a[@href='/products/urban-fit-x-smart-watch'])[2]")).click();
		WebElement chatwidget = driver.findElement(By.xpath("//iframe[@title='chat widget']"));
		driver.switchTo().frame(chatwidget);
		driver.findElement(By.xpath("//div[@class='VizExIcon__IconWrapper-sc-13xmv9w-0 kLdQSk']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("wk_zipcode")).sendKeys("625022");
		driver.findElement(By.className("wk_zipfinder_btn")).click();
		driver.findElement(By.id("product-add-to-cart")).click();
		
		
		
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		//driver.findElement(By.xpath("//span[@data-hover='View Cart']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("checkout")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();

	}

}

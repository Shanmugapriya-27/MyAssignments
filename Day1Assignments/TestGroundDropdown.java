package week4.Day1Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestGroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Select UITool = new Select(driver.findElement(By.className("ui-selectonemenu")));
		UITool.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India'1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(10000);
		List<WebElement> eleCourse = driver.findElements(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li"));
		for (int i = 0; i < eleCourse.size(); i++) {
			System.out.println(eleCourse.get(i).getText());
			
		}
		
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//li[text()='Playwright']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.id("j_idt87:value_1")).click();
		
		
	}

}

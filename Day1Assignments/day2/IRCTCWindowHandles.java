package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCWindowHandles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.findElement(By.xpath("//span[contains(@class,'allcircle circleone')]")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		/*for (String getwindowhandles : windowHandles) {
			
		}*/
		
		List<String> getwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(getwindow.get(1));
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File savefile = new File("./snaps/Flights.png");
		FileUtils.copyFile(screenshot, savefile);
		
		driver.close();
		driver.switchTo().window(getwindow.get(0));
		System.out.println(driver.getTitle());
	}

}

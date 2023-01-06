package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> OpenHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(OpenHandles.get(1));
		String SecondWindow = driver.getTitle();
		if(windowHandles.size()>0) {
			System.out.println("The new window opened");
		}else
			System.out.println("No new window present");

		driver.close();
		driver.switchTo().window(OpenHandles.get(0));

		//open multiple

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Thread.sleep(10000);
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> OpenwindowHandles1 = new ArrayList<String>(windowHandles1);
		System.out.println(windowHandles1.size());
		for (int i = 1; i < windowHandles1.size(); i++) {
			driver.switchTo().window(OpenwindowHandles1.get(i));
			driver.close();

		}

		driver.switchTo().window(OpenwindowHandles1.get(0));




		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Thread.sleep(10000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> OpenwindowHandles = new ArrayList<String>(windowHandles2);
		for (int i = 1; i < windowHandles2.size(); i++) {
			driver.switchTo().window(OpenwindowHandles.get(i));
			driver.close();

		}

		driver.switchTo().window(OpenwindowHandles.get(0));


		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Thread.sleep(10000);
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> Opendelaywindow = new ArrayList<String>(windowHandles3);
		for (int i = 1; i < windowHandles3.size(); i++) {
			driver.switchTo().window(Opendelaywindow.get(i));
			driver.close();

		}

		driver.switchTo().window(Opendelaywindow.get(0));	}

}

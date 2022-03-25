package codes;

import java.time.Duration;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWIndows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		String WindowId = driver.getWindowHandle();
		System.out.println(WindowId);
		 WebElement link = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		 link.click();
		 Set<String>WindowIds = driver.getWindowHandles();
		 // Using Iterator()
		 Iterator<String>it = WindowIds.iterator();
		 String ParentWindowId = it.next();
		 String ChildWindowId = it.next();
		 System.out.println("Parent Window Id:"+ParentWindowId);
		 System.out.println("Child Window Id:"+ChildWindowId);
		 
		 //Using ArrayList
		 List<String>WindowIdList = new ArrayList(WindowIds);
		// String ParentWindowId =WindowIdList.get(0) ;
    	 S//tring ChildWindowId = WindowIdList.get(1);
		 System.out.println("Parent Window Id:"+ParentWindowId);
		 System.out.println("Child Window Id:"+ChildWindowId);
		 driver.switchTo().window(ParentWindowId);
		 System.out.println("Parent Window title is:"+driver.getTitle());
		 driver.switchTo().window(ChildWindowId);
		 System.out.println("Child Window title is:"+driver.getTitle());

	}

}

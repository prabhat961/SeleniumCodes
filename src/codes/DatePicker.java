package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String Year = "2022";
		String Month = "November";
		String Day = "17";
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		while(true) {
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String[] arr = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			if(mon.equalsIgnoreCase(Month) && yr.equals(Year)) 
				break;
			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		}

	}

}

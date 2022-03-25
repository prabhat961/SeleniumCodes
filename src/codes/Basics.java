package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 String Name = driver.getTitle();
		System.out.println(Name);
		WebElement SearchBar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement Male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Status:"+SearchBar.isDisplayed());
		System.out.println("Status:"+Male.isSelected());
		
	}

}

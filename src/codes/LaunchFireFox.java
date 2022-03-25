package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/");
		 //Find Element
		 WebElement SearchBar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 SearchBar.sendKeys("xyz");

	}

}

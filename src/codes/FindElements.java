package codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/");
		 //Find Element
		 WebElement SearchBar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 SearchBar.sendKeys("xyz");
		 
		 //Find Elements - locator used points to multiple elements
		 WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		 System.out.println(ele.getText());
		 
		 //Finding Multiple webElements
		 List<WebElement>Links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		 System.out.println("Number of links present:"+Links.size());
		 
		 //printing all links
		 for(WebElement link:Links ) {
			 System.out.println(link.getText());
		 }

	}

}

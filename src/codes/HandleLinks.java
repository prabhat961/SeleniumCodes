package codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// Use of Linked Text
		//WebElement DealsBtn = driver.findElement(By.linkText("Today's Deals"));
		// Use of Partial linked Text
		//WebElement DealsBtnTab = driver.findElement(By.partialLinkText("Today's Dea"));
		//DealsBtn.click();
		//DealsBtnTab.click();
		//Capture all links of the page
		List<WebElement>Links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present in the page is:"+ Links.size());
		for(int i = 0; i < Links.size();i++) {
			System.out.println(Links.get(i).getText());
			System.out.println(Links.get(i).getAttribute("href"));
		}
		
		 

	}

}

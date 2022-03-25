package codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java tutorial");
		 Thread.sleep(3000);
		 List<WebElement>list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		 System.out.println("Number of Auto Suggestion s is:"+list.size());
		 for(WebElement listItem: list) {
			 if(listItem.getText().contains("beginners")) {
				 listItem.click();
				 break;
			 }
		 }
		 
	}

}

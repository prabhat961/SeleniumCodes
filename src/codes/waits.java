package codes;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	//Explicit Wait generic Method
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Implicit Wait:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);//Press enter
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		//Explicit Wait
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
     	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
     	WebElement element = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
     	element.click();
     	//Fluent Wait
		//declration of fluent wait
     	Wait<WebDriver>myWait2 = new FluentWait<WebDriver>(driver)
     			.withTimeout(Duration.ofSeconds(30))
     			.pollingEvery(Duration.ofSeconds(5))
     			.ignoring(NoSuchElementException.class);
     	//usage of fluent wait
     	WebElement ele = myWait.until(new Function<webDriver, webElement>(){
     		public WebElement apply(WebDriver driver) {
     			return driver.findElement(By.xpath("//h3[text()='Selenium']"));
     		}
     	}
     	ele.click();
     	
     	}

}

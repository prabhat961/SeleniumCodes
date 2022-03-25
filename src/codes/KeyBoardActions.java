package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://the-internet.herokuapp.com/key_presses");
//		driver.manage().window().maximize();
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ESCAPE).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.COMMAND).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.SPACE).perform();
//		Thread.sleep(3000);
		//Multiple Keys action
		driver.get("https://www.text-compare.com/");
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("Welcome to Selenium");
		Actions act = new Actions(driver);
		//CTRL+A
				act.keyDown(Keys.CONTROL);
				act.sendKeys("a");
				act.keyUp(Keys.CONTROL);
				act.perform();
		//CTRL+C
				act.keyDown(Keys.CONTROL);
				act.sendKeys("c");
				act.keyUp(Keys.CONTROL);
				act.perform();
		//Press TAB to switch to next input Box
				act.sendKeys(Keys.TAB);
				act.perform();
		//CTRL+V
				act.keyDown(Keys.CONTROL);
				act.sendKeys("v");
				act.keyUp(Keys.CONTROL);
				act.perform();
				if(input1.getAttribute("value").equals(input2.getAttribute("value")))
					System.out.println("Text copied");
				else
					System.out.println("Text Not copied");
		
	}

}

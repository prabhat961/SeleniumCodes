package codes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//Alert with OK button
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		//Alert Window with OK and cancel button
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		driver.switchTo().alert().dismiss();// click cancel button
//		//Alert Window with input box and capture text from it
		driver .findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		Thread.sleep(3000);
		Alert alertWindow = driver.switchTo().alert();
		System.out.println("msg displayed in alert window is:"+alertWindow.getText());
		alertWindow.sendKeys("Welcome");
		alertWindow.accept();

	}

}

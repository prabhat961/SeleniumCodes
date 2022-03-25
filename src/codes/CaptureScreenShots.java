package codes;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.*;



public class CaptureScreenShots {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		//Full Page ScreenShot
		TakesScreenshot ts = (TakesScreenshot)driver;
		FIle src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshot\\homepage.png");
		FileUtils.copyFile(src,trg);
		

	}

}

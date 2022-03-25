package codes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		//To enter username and password in these authentication pop ups we use the below syntex to fill in th data
		//user:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}

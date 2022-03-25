package codes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement>Links = driver.findElements(By.tagName("a"));
		int brokenLink = 0;
		for(WebElement element:Links) {
			String url = element.getAttribute("href");
			if(url == null ||url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			URL link = new URL(url);
			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400) {
					System.out.println(httpconn.getResponseCode()+" is"+url+"   Broken link");
					brokenLink++;
				}
				else {
					System.out.println(httpconn.getResponseCode()+" is"+"   Valid Link");
				}
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Number of broken links is:"+brokenLink);
		driver.quit();
	}

}

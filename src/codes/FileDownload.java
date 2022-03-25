package codes;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) {
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		HashMap prefrences = new HashMap();
		prefrences.put("download.default_directory", location);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefrences);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tbody/tr[6]/td[5]/a[1]")).click();
		

	}

}

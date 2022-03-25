package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablePagenation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		WebElement LoginBtn = driver.findElement(By.xpath("//i[@class='fa fa-key']"));
		LoginBtn.click();
		//Sales----> Order
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		//Table
		//FInd Total Number of Pages
		String TotalPageNumber = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(TotalPageNumber);
		int total_pages = Integer.valueOf(TotalPageNumber.substring(TotalPageNumber.indexOf("(")+1, TotalPageNumber.indexOf("Pages")-1));
		System.out.println("Total Number of pages in this table is:"+total_pages);
		//Total row Count
		for(int p = 1; p <= 5; p++) {
			WebElement active_Page = driver.findElement(By.xpath("//ul[@class = 'pagination']//li//span"));
			System.out.println("Active Page:"+active_Page.getText());
			active_Page.click();
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows:"+rows);
			String pageNo = Integer.toString(p +1);
			driver.findElement(By.xpath("ul[@class = 'pagination']//li//a[text()='"+pageNo+"']")).click();
			
		}
		
		

	}

}

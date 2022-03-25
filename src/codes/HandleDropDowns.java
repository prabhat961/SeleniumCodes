package codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rnjp\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.opencart.com/index.php?route=account/register");
		 WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		 Select drpCountry = new Select(drpCountryEle);
		 //Select ByVisibleText
		 drpCountry.selectByVisibleText("Belgium");
		 //SelectByValue
		 drpCountry.selectByValue("24");//Bermuda
		 //SelectByIndex
		 drpCountry.selectByIndex(14);//Austia
		 
		 List<WebElement>CountryName = drpCountry.getOptions();
		 for(WebElement names:CountryName) {
			 if(names.getText().equals("Croatia")) {
				 names.click();
			 break;
			 }
		 }

	}

}

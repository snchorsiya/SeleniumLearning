package SeleniumLeraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Java++");
		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Python");
		
		// Dynamic id: input
		// id = test_123
		// By.id("test_123")
		// id = test_567
		// id = test_789
		// id = test_test_4565_test
		
		// Not use Starts-with function:
		//id = 11345_test_t
		//id = 4587_test_t
		//id = 43434_test_t
		
		//driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[ends-with(@id, '_test_t')]")).sendKeys("test");
		
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();

	}

}

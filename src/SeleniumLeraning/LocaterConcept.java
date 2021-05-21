package SeleniumLeraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocaterConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println(title);

		driver.findElement(By.linkText("Sign in")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("jj420867+a3@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		Thread.sleep(2500);

		driver.findElement(By.className("top")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("customer_firstname")).sendKeys("Johan");
		driver.findElement(By.id("customer_lastname")).sendKeys("pitar");
		driver.findElement(By.id("passwd")).sendKeys("Demo@123");

		// Drop down Hendling
		Thread.sleep(3000);

		WebElement days = driver.findElement(By.id("days"));
		Select select = new Select(days);
		select.selectByValue("1");

		WebElement months = driver.findElement(By.id("months"));
		Select select1 = new Select(months);
		select1.selectByValue("1");

		WebElement year = driver.findElement(By.id("years"));
		Select select2 = new Select(year);
		select2.selectByValue("1997");

		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();

		driver.findElement(By.id("company")).sendKeys("DemoTesting");
		driver.findElement(By.cssSelector("#address1")).sendKeys("123, First flore,US");
		driver.findElement(By.id("city")).sendKeys("Ahmedabad");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select select3 = new Select(state);
		select3.selectByVisibleText("Indiana");
		
		driver.findElement(By.id("postcode")).sendKeys("12345");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select select4 = new Select(country);
		select4.selectByVisibleText("United States");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("0000123456");
		driver.findElement(By.id("alias")).sendKeys("US,Tony");
		//Thread.sleep(3000);
		driver.findElement(By.id("submitAccount")).click();
		
		driver.findElement(By.className("logout")).click();


	}

}

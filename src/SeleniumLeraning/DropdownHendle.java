package SeleniumLeraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHendle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("jj420867@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		
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
	}

}

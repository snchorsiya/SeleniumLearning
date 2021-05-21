package SeleniumLeraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://reports.mocact.com/mainpage.aspx");

		driver.findElement(By.id("USERID")).sendKeys("fldsadmin");
		driver.findElement(By.id("PASSWORD")).sendKeys("cvr12345$");

		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.className("fa fa-cogs")).click();
		
	}

}

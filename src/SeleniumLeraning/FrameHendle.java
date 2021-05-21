package SeleniumLeraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHendle {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver(); //
		 * driver.manage().window().maximize();
		 * 
		 * driver.get("https://classic.freecrm.com/index.html?e=1");
		 * 
		 * driver.findElement(By.name("username")).sendKeys("naveenk");
		 * driver.findElement(By.name("password")).sendKeys("test@123");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */
		
		
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
		
		//driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div/a[2]/i")).click();
		
	
		
	}
}

	


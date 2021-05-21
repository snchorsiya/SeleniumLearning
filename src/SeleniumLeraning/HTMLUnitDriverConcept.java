package SeleniumLeraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		// WebDriver driver = new ChromeDriver();

		WebDriver driver = new HtmlUnitDriver();

		driver.manage().window().maximize();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://reports.mocact.com/");

		System.out.println("Before login: " + driver.getTitle());

		driver.findElement(By.name("USERID")).sendKeys("fldsadmin");
		driver.findElement(By.name("PASSWORD")).sendKeys("cvr12345$");
		driver.findElement(By.name("btnLogon")).click();

		System.out.println("After login: " + driver.getTitle());

	}

}

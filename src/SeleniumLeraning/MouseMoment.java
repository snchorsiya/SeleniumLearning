package SeleniumLeraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoment {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		actions.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Member Login")).click();

	}

}

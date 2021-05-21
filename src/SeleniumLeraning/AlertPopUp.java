package SeleniumLeraning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		Thread.sleep(3000);

		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Messagwe");
		} else {
			System.out.println("In-correct Message");
		}

		alert.accept(); // Ok Button
//		// alert.dismiss(); // Cancel button

		/*
		 * driver.findElement(By.id("login1")).sendKeys("Demo@123");
		 * 
		 * driver.findElement(By.name("proceed")).click();
		 * 
		 * Thread.sleep(3000); Alert alert = driver.switchTo().alert();
		 * 
		 * System.out.println(alert.getText());
		 * 
		 * 
		 * 
		 * alert.accept();
		 */

	}

}

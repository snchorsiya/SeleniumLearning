package SeleniumLeraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://devstagingnew.trainingmine.com/");

		 driver.manage().window().maximize();
		
		//1. isDisplayed() methods
		
		boolean b1 = driver.findElement(By.id("btnLogon")).isDisplayed();
		System.out.println(b1);
		
		
		//2. isEnabled() methods
		
		boolean b2 = driver.findElement(By.id("btnLogon")).isEnabled();
		System.out.println(b2);
		
		
		//3. isSelected() method: only applocable for checkbox, dropdown, radio button
		
		boolean b3 = driver.findElement(By.id("btnLogon")).isSelected();
		System.out.println(b3);
		

		
	}

}

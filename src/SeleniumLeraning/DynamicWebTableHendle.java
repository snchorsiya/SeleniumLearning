package SeleniumLeraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHendle {

	public static void main(String[] args) {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.demoqa.com/webtables");

		

	}

}

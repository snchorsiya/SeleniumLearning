package SeleniumLeraning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPopFile {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties pop = new Properties();

		FileInputStream ip = new FileInputStream(
				"E:\\Selenium_tutorial\\SeleniumProject\\src\\SeleniumLeraning\\config.properties");

		pop.load(ip);

		System.out.println(pop.getProperty("name"));
		System.out.println(pop.getProperty("age"));

		String url = pop.getProperty("URL");

		System.out.println(url);

		String browserName = pop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		} else if(browserName.equals("firebox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.findElement(By.xpath(pop.getProperty("yourname_xpath"))).sendKeys(pop.getProperty("yourname"));
		driver.findElement(By.xpath(pop.getProperty("mobilenumber_xpath"))).sendKeys(pop.getProperty("mobilenumber"));
		driver.findElement(By.xpath(pop.getProperty("password_xpath"))).sendKeys(pop.getProperty("password"));
		driver.findElement(By.xpath(pop.getProperty("continue_xpath"))).click();
	

	}

}

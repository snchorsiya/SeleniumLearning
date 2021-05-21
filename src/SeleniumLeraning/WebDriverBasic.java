package SeleniumLeraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle(); 
		
		System.out.print(title);
		
		if(title.equals("Google"))
		{
			System.out.print("\nCorrect Title");
		}
		else
		{
			System.out.print("In-Correct title");
			
			//System.out.println(driver.getCurrentUrl());
			
			// System.out.println(driver.getPageSource());
			
			driver.quit();  //Quit the Browser
			
			
		}
	}

}

package SeleniumLeraning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");
		
		//get the count of links on the page
		
		List <WebElement> linklist =  driver.findElements(By.tagName("a"));
		
		//Size of linklist
		
		System.out.println(linklist.size());
		
		//get the text of each link on the page
		
		for(int i = 0; i < linklist.size(); i++)
		{
			String linkText = linklist.get(i).getText();	
			System.out.println(linkText);
			
		}

	}

}

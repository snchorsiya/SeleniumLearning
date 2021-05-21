package SeleniumLeraning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleDynamicGoogleSearch {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li"));
		
		System.out.println("Totlal number of suggestion in search box:::===>" + list.size());
	    
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java download")) {
				list.get(i).click();
				break;
			}
		}
	
	}
}

		
	
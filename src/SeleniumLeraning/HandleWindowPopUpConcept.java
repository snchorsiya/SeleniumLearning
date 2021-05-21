package SeleniumLeraning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUpConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String perentWindow = it.next();
		System.out.println("Perent window id:" + perentWindow);
		
		String chaildWindwo = it.next();
		System.out.println("ChaildWindow id:" + chaildWindwo);
		
		driver.switchTo().window(chaildWindwo);
		
		System.out.println("chiled window pop up title" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(perentWindow);
		
		System.out.println("perent window pop up title" + driver.getTitle());

	}

}

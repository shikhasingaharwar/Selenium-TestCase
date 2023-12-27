import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//explicit wait of 10 sec
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		Stopwatch watch = null;
		try {
			watch =Stopwatch.createStarted();
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
			element.click();
			
	
	}
	catch(Exception e)	
		{
		watch.stop();
		System.out.println(e);
		System.out.println(watch.elapsed(TimeUnit.SECONDS)+ " seconds ");
	}
	}
}

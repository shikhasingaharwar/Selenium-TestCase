import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class FluentWait {

	
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//fluentwait of 10 sec
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
	.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
		element.click();
		
		
		
		
		
	
	Stopwatch watch = null;
		
			try {
				watch =Stopwatch.createStarted();
				
				
		
		}
		catch(Exception e)	
			{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+ " seconds ");
				
	}
	}
}

package MyPackagee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//wait of 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//if webelement not find= throws no such elemmnt exception
		
		
		driver.findElement(By.linkText("Sell")).click();
		
		
	}

}

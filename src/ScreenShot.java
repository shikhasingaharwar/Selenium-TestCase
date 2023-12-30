import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		//Capture fullpage screenshot
		//Step 1: Connvert webdriver object TakeScreenShot interface
		//TakesScreenshot scrshot = ((TakesScreenshot)driver);
		
		//call getScreenshotAs mathod to create image  file
		
	    //File src = scrshot.getScreenshotAs(OutputType.FILE);
	    
	    //copy src file in destination
	   // File dest = new File("C:\\Users\\91922\\eclipse-workspace\\Maven_project\\Screenshots\\fullpage.png");
	    //use FileUtils to copy src file in dest
	    //FileUtils.copyFile(src, dest);Capture section of webpage
		WebElement section = driver.findElement(By.xpath("//input[@type='text']"));
		
		//call getScreenshotAs mathod to create image  file
		
	    File src = section.getScreenshotAs(OutputType.FILE);
	    
	    //copy src file in destination
	    File dest = new File("C:\\Users\\91922\\eclipse-workspace\\Maven_project\\Screenshots\\section.png");
	    //use FileUtils to copy src file in dest
	    FileUtils.copyFile(src, dest);
	    
	
	}

}

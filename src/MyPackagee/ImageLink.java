package MyPackagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//open opencart web page
		driver.get("https://www.opencart.com/");

		//locate username By id
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		 
		// verify title of ccurrent page with expected page
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{		
System.out.println("test passed");

		}
		else
		{
System.out.println("test failed");
}
		driver.close();
}
}
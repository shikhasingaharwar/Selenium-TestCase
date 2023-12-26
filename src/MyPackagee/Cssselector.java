package MyPackagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/inventory.html");
		 
		 //locate usernname---tag#id
		 driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		 
		 //locate pwd--tag[attribute=value]
		 driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		 
		 //locate login btn--tag.value of class name
		 driver.findElement(By.cssSelector("input.submit-button")).click();
		 		
		 //switch to product page
		 String currentWindowHandle =driver.getWindowHandle();
		 driver.switchTo().window(currentWindowHandle);
		 //tag.value of class[attribute=value]
		 driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-bagpack]")).click();
	}

}

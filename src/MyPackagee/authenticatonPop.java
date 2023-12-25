package MyPackagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authenticatonPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

//driver.get("https://UserName:Password@Example.com");   syntax for Authentication Pop up
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

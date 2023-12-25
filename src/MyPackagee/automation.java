package MyPackagee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
WebDriver driver= new ChromeDriver(options);
driver.get("https://www.google.com");
	}

}

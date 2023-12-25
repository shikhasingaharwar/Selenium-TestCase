import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureimagesourceURL {

	private static Object WebDriverManager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//find webelement facebook log
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

		//capture "src" attribute value of imagelogo
		System.out.println("Src attribute value:" + logo.getAttribute("src"));
		   driver.quit();



	}

}

package MyPackagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmaAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		//maximise browser
		driver.manage().window().maximize();

		//open url
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		//Alerts
		//find alert button and perform click
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();


		//switch to alert window and accept the alert
		//driver.switchTo().alert().accept();// ok button is clicked
		driver.switchTo().alert().dismiss();// to cancel alert
	}

}

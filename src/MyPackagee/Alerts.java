package MyPackagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
	//launch chrome browser	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

//maximise browser
driver.manage().window().maximize();

//open url
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

//Alerts
//find alert button and perform click
driver.findElement(By.xpath("//button[@id='alertBox']")).click();


//switch to alert window and accept the alert
driver.switchTo().alert().accept();
	}

}

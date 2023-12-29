package MyPackagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); 
driver.manage().window().maximize();
		//open web page

		driver.get("https://demoqa.com/buttons");
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		//above statement will return webelement button
		
		//to perform action
		Actions act =new Actions(driver);
		
		//perform right click=contextClick;syn:object.contextClick(webelement).perform
		act.contextClick(button).build().perform();//Right click Action

	}

}

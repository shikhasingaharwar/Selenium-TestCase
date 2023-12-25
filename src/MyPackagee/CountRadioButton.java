package MyPackagee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//mximize browser
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		// find  radio button on webpage
		List <WebElement> radiobuttonList = driver.findElements(By.xpath("//input[@type='radio']"));
		 //print total no. of radio button
		System.out.println("no. of radio button:"+ radiobuttonList.size());
		driver.close();
		
				
		
	}

}

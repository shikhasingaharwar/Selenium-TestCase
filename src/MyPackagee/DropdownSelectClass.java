package MyPackagee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//open opencart web page
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement element= driver.findElement(By.id("input-country"));
		
		Select dropDown = new Select(element);
		 //dropDown.selectByVisibleText("Hongkong");
		//dropDown.selectByIndex("3");
		dropDown.selectByValue("5");
		
		if( dropDown.isMultiple())
		{
			System.out.println("drop down is multiple");
			}
		else
		{
			System.out.println("dro down is not multiple");
			}
		//to print all option use get methd
		List <WebElement> alldropdown= dropDown.getOptions();
		for(WebElement e1:alldropdown )
		{
			System.out.println("e1.getText()");
		}
	}

}

package MyPackagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); 
driver.manage().window().maximize();
// TODO Auto-generated method stub
driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
 
//find source and target webelement
WebElement source=driver.findElement(By.id("box1"));//oslo
WebElement target =driver.findElement(By.id("box101"));//norway

//perform mouse action
Actions act= new Actions(driver);
 
//draganDrop(source, target)
act.dragAndDrop(source, target).build().perform();


	}

}

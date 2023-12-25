package MyPackagee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyoperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//mximize browser
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		 //hyperlinks =anchortag
		 List <WebElement> linkElement=driver.findElements(By.tagName("a"));
		 //count no of hyperlinks
		 System.out.println("Total links on webpage:"+ linkElement.size());
		 
		//print all hyperlinks
		 for(WebElement e1:linkElement)
		 {
			 System.out.println(e1.getText());
		 }
	
		driver.close();
	

}
}
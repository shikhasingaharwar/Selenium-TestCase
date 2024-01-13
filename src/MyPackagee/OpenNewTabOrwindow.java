package MyPackagee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		System.out.println( "First page:" + driver.getTitle());//get title of google
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println( "Second page:" + driver.getTitle());
		
		//get windowhandles of open windows
		Set <String> windowHandles =driver.getWindowHandles();
		List <String> handles =new ArrayList<String>();
		
		handles.addAll(windowHandles);
		
		driver.close();
		
		driver.switchTo().window(handles.get(0));//switch to google page
		
		System.out.println( "First page:" + driver.getTitle());//get title of google
		
	}

}

package MyPackagee;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91922\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //wait 10 sec
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //open url
		 driver.get("http://www.deadlinkcity.com/");
		 
		 //find hyperlinks(list of link=findElements)
		 List <WebElement> linkList = driver.findElements(By.tagName("a"));
		 
		 //make variable after connection to get response code
		 int resCode = 200;//Valid link
		 int brokenLinkCnt=0; //make varible to count broken link
		  
		 System.out.println(" total links on page:"+ linkList.size());
		 //capture url of each hyperlink
		 for(WebElement element:linkList)
		 {
			 String url=element.getAttribute("href");//capture url
			 try {
			 
				 URL urlLink = new URL(url);//create object of url(import url)
				//open all url using http connection
				HttpURLConnection huc =  (HttpURLConnection)urlLink.openConnection();
				
				//send request=object.setRequestMethod("")
				huc.setRequestMethod("HEAD");
				huc.connect();//connect after request=object.connect()
				// store response code after making variable
				resCode=huc.getResponseCode();
				
				// check response code
				if(resCode >=400)
				{
					System.out.println(url + "Broken link");
					brokenLinkCnt++;
				}
			 }
			 
			 catch(MalformedURLException e)
			 {
		 
			 }
catch(Exception e)
			 {
	
			 }

			 }
		 System.out.println("total broken links:" + brokenLinkCnt);
	}
	
}
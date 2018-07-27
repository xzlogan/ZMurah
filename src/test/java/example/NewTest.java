package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
 
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		
		@BeforeTest
		public void beforeTest() {	
		 System.setProperty( "webdriver.gecko.driver" ,System.getProperty("user.dir") +"/plugins/geckodriver"); 
		  driver = new FirefoxDriver(); 
		 
		 //System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+ "/plugins/chromedriver" ); 
		// driver = new ChromeDriver();
		// System.setProperty("phantomjs.binary.path",  System.getProperty("user.dir")+ "/plugins/phantomjs" ); 
		//driver = new PhantomJSDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}	
		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();
			System.out.print(title);
			AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
}	

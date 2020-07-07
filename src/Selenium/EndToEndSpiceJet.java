
//Total End to End Automationof SpiceJet

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndSpiceJet {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver webchrome=new ChromeDriver();
		/*webchrome.get("https://www.facebook.com");
		
		Select s=new Select(webchrome.findElement(By.id("day")));
		s.selectByValue("3");
		s.selectByIndex(8);
		s.selectByVisibleText("10");
		Select s1=new Select(webchrome.findElement(By.id("month")));
		s1.selectByValue("1");
		Select s2=new Select(webchrome.findElement(By.id("year")));
		s2.selectByVisibleText("2020");*/
		
		
		//SPice Jet
		
		webchrome.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		//Select Departure and Arrival Location
		webchrome.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//webchrome.findElement(By.id("ctl00_mainContent_ddl_originStation1")).sendKeys("Delhi");
		
		webchrome.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		webchrome.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//webchrome.findElement(By.xpath("(//a[@value='MAA'])")).click(); //It also works
		
		Thread.sleep(1000);
		
		
		
		//Calendar Click
		webchrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		System.out.println(webchrome.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		//Check for Arrival Calendar is enabled??? Print the changing attribute as follows
		System.out.println(webchrome.findElement(By.id("Div1")).getAttribute("style"));
		
		//webchrome.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		
		
		if (webchrome.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println("Arrival Cal Disabled");
		Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//Select No of Adults
		Select sd=new Select(webchrome.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		webchrome.findElement(By.id("divpaxinfo")).click();
		webchrome.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		sd.selectByValue("3");
		Select sd1=new Select(webchrome.findElement(By.id("ctl00_mainContent_ddl_Child")));
		sd1.selectByIndex(1);
		Select sd2=new Select(webchrome.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		sd2.selectByVisibleText("3");
		
		
		//Select Currency
		webchrome.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select sd3=new Select(webchrome.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		sd3.selectByIndex(0);
		webchrome.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
	}

}

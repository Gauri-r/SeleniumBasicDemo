package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTut {
	public static void main(String[] args) throws InterruptedException {
	//	For Fire Fox Not Working
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Destiny\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver webchrome=new FirefoxDriver();
		
		
		//For InternetExplorer  Working
		//System.setProperty("java.net.preferIPv4Stack", "true"); //It is not required
		/*System.setProperty("webdriver.ie.driver","C:\\Users\\Destiny\\Downloads\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
		WebDriver Web=new InternetExplorerDriver();*/
		//Webobj.get("https://www.gmail.com");
		
		//For Chrome Working
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Destiny\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver webchrome=new ChromeDriver();
		webchrome.get("https://www.facebook.com");
		webchrome.getTitle();
		
		webchrome.findElement(By.cssSelector("#email ")).sendKeys("g12345@gmail.com");
		webchrome.findElement(By.id("pass")).sendKeys("12345");
		webchrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webchrome.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		Thread.sleep(500);
		webchrome.navigate().back();
 
		//*[@id="facebook"]/body
		//webchrome.navigate().back();
		//System.out.println("M Back ");
		//webchrome.close();
		
		
		
		
	}

	
}

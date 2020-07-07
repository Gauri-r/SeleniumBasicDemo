package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver WebChrome=new ChromeDriver();
		WebChrome.get("https://www.facebook.com/");
		System.out.println(WebChrome.getTitle());
		//Generating Xpath Syntax:- //tagName[@attribute=value]  or //*[@attribute=value]
		WebChrome.findElement(By.xpath("//*[@type='email']")).sendKeys("SSDDFF");
		WebChrome.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");;
		//WebChrome.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//Generating CSS syntax:- tagName[attribute=value]  or tagName#id
		//WebChrome.findElement(By.cssSelector("input[value='Log In']")).click(); 

		WebChrome.findElement(By.cssSelector("input#u_0_b")).click();
		//OR   WebChrome.findElement(By.cssSelector("#u_0_b")).click();
		//OR   WebChrome.findElement(By.cssSelector("input.classname")).click();
		System.out.println(WebChrome.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div > a")).getText());
		
		 
		System.out.println("Facebook Opened Successfully");
		System.out.println("Facebook Operation Successful");
		System.out.println("Getting Started with Facebook");
		
		
	}

}

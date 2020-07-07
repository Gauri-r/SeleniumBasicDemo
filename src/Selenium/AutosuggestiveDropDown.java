package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDown {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	
	//driver.findElement(By.xpath("//input[@placeholder='From']")).click(); //It Doesnt Work bcz we dont click on this text box 
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bangk");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("goa");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.cssSelector(".ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2")).click();

	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression 
	{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		cdriver.findElement(By.xpath("//a[contains(@title,'Sign')]")).click();
		cdriver.findElement(By.cssSelector("input#login1")).sendKeys("smtp");;
		cdriver.findElement(By.cssSelector("input[name*='wd']")).sendKeys("kkk12345");
		cdriver.findElement(By.xpath("//*[@type='submit']")).click();
		cdriver.findElement(By.linkText("Forgot Password?")).click();
	}

}

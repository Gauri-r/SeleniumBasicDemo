package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Kittu";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.switchTo().alert().getText());
		
	
	}

}

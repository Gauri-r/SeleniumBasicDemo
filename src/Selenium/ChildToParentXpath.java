
//Sibling Traverse

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildToParentXpath {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Chrome=new ChromeDriver();
		Chrome.get("https://www.rediff.com/");
		//Chrome.findElement(By.xpath("//a[@class='signin']")).click();  //By Xpath to Sign in
		//Chrome.findElement(By.linkText("Sign in")).click();			//By Link text...Diret Text
		Chrome.findElement(By.xpath("//*[text()='Sign in']")).click();
		Chrome.findElement(By.xpath("//div[@class='cell']/input")).sendKeys("satara");
		Chrome.findElement(By.cssSelector("input#password ")).sendKeys("12345");
		Thread.sleep(500);
		Chrome.findElement(By.xpath("//input[@name='passwd']/following-sibling::input")).click();
		//Chrome.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}

}

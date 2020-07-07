package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXpath {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver webD=new ChromeDriver();
		webD.get("https://www.google.com/");
		System.out.println(webD.getTitle());
		//webD.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("geeksforgeeks");
		webD.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");;
		
		webD.findElement(By.xpath("//div[contains(@class,'gb_Ua gb_Bg gb_i gb_Ag gb_Eg gb_Sf')]/div/div/a")).click();
	}

}

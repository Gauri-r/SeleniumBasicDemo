package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonOp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon Page is fetched");
	
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"shovlStateHeader\"]/div[1]/span[2]/a/span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#shovlStateHeader > div.a-section.a-spacing-micro > span:nth-child(3) > a > span")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector("#dealTitle > span")).click();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("sari");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[6]/span/div[1]/div[4]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		System.out.println(driver.getTitle());
		driver.close();		
}

}

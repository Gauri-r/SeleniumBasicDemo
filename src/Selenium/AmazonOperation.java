package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonOperation {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver WebObj=new ChromeDriver();
		WebObj.navigate().to("https://www.gmail.com/");
		WebObj.manage().window().maximize();
		String title=WebObj.getTitle();
		if (title.equalsIgnoreCase("gmail.com")) {
			System.out.println("Title Matches");
			
		} else {
			System.out.println(title);
		}
		
		//String tagname="";
		//tagname=WebObj.findElement(By.className("ap-locale-en_IN a-m-us a-aui_157141-c a-aui_158613-t1 a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate")).getText();
			//	System.out.println(tagname);
				
		/*Gmail Login
				Actions act=new Actions(WebObj);
				WebElement cat=WebObj.findElement(By.id("identifierId"));	
				act.moveToElement(cat);
				act.click();
				act.perform()*/;
		
		// Gmail Login Page 
				//Entering gmail id
				WebElement WebEle= WebObj.findElement(By.xpath("//*[@id=\"identifierId\"]"));
				WebEle.sendKeys("gaurirevale5457@gmail.com");
				//Click on Next
				WebElement WebEle1=WebObj.findElement(By.xpath("//*[@id=\"identifierNext\"]/span"));
				WebEle1.click();
				//WebObj.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).click();
				
				WebObj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				WebElement WebEle2=WebObj.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
				WebEle2.sendKeys("shobha");
				
				WebElement WebEle3=WebObj.findElement(By.cssSelector("#passwordNext > span > span"));
				WebEle3.click();
				//WebObj.get("www.amazon.in");
				
				//WebObj.manage().window().maximize();
	}
}

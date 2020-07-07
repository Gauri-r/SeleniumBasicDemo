package UdemyAssignments;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EndToEndClearTrip {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.cleartrip.com/");
		//driver.findElement(By.xpath("//div[@class='closeit']")).click();
		
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.cssSelector("select[id='Adults']")).click();
		Select selA=new Select(driver.findElement(By.cssSelector("select[id='Adults']")));
		selA.selectByValue("3");
		driver.findElement(By.cssSelector("select[id='Childrens']")).click();
		Select selC=new Select(driver.findElement(By.cssSelector("select[id='Childrens']")));
		selC.selectByIndex(1);
		driver.findElement(By.cssSelector("select[id='Infants']")).click();
		Select selI=new Select(driver.findElement(By.cssSelector("select[id='Infants']")));
		selI.selectByValue("1");
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.id("Class")).click();
		Select selClass=new Select(driver.findElement(By.id("Class")));
		selClass.selectByIndex(3);
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Malindo"); 
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}

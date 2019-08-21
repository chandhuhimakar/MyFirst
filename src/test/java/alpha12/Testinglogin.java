package alpha12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testinglogin {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		Actions ven=new Actions(driver);
		 driver.findElement(By .name("userName")).sendKeys("lalitha");
		 ven.sendKeys(Keys.TAB).perform();
		 driver.findElement(By .name("password")).sendKeys("Password123");
		 ven.sendKeys(Keys.TAB).perform();
		 ven.sendKeys(Keys.TAB).perform();
		 ven.sendKeys(Keys.TAB).perform();
		 ven.sendKeys(Keys.TAB).perform();
		 ven.sendKeys(Keys.TAB).perform();
		 ven.sendKeys(Keys.ENTER).perform();	
		 String awm=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div")).getText();
		 String x=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div")).getText();
		 Assert.assertEquals(awm, x);;
		
					
						
  }
}

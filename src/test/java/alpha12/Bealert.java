package alpha12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bealert {
	WebDriver driver;
	  @Test
	  public void f() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
	  driver=new ChromeDriver();

	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
	  System.out.println("1."+driver.getTitle());
	  driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
	  Alert a=driver.switchTo().alert();
	  a.accept();
	  driver.findElement(By .name("products")).sendKeys("Earphones");
}
}
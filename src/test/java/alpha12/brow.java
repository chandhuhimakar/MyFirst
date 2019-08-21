package alpha12;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class brow {
	
	private static final boolean flase = false;
	WebDriver driver;
	  @Test
	  public void f() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			driver.findElement(By .linkText("SignIn")).click();
		
			driver.manage().window().maximize();
			driver.findElement(By .name("userName")).sendKeys("lalitha");
			driver.findElement(By .name("password")).sendKeys("Password123");
			driver.findElement(By .name("Login")).click();
			String str=driver.findElement(By .name("SignIn")).getText();
			System.out.println(str);
}
	  
	  @Test(enabled=flase)
	  public void f1() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.amazon.co.in");
	  }
}
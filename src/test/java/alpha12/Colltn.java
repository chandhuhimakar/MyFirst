package alpha12;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Colltn {
	WebDriver driver;
	  @Test
	  public void Lost() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.google.co.in");
			
			driver.manage().window().maximize();
		List<WebElement> lnkcoll=driver.findElements(By .tagName("a"));
		System.out.println(lnkcoll.size());
		for(int i=0;i<=lnkcoll.size()-1;i++) {
			String lnkname=lnkcoll.get(i).getText();
			System.out.println(lnkname);
			if(lnkname.contentEquals("Gmail")) {
				lnkcoll.get(i).click();
				break;
			}
		}
}
}

package alpha12;

import java.io.File;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsTest {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeTest
  public void startReport() {
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-reports/"+new SimpleDateFormat("hh-mm-ss-dd-MM-yyyy").format(new Date())+".html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "GFT NextGen Testing");
		extent.setSystemInfo("Environment", "Selenium automation Testing");
		extent.setSystemInfo("User Name", "Vishnu");
		htmlReporter.config().setDocumentTitle("Selenium Testing");
		htmlReporter.config().setReportName("Final Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	@Test
	public void passTest() {
		logger=extent.createTest("passTest");
		Assert.assertTrue(true);
		logger.log(Status.PASS,MarkupHelper.createLabel("Test case passed is passTest",ExtentColor.GREEN));
	}
	@Test
	public void failTest() {
		logger=extent.createTest("failTest");
		Assert.assertTrue(true);
		logger.log(Status.PASS,MarkupHelper.createLabel("Test case passed is failTest",ExtentColor.RED));
	}
	@Test
  public void skipTest() {
		logger=extent.createTest("skipTest");
		throw new SkipException("Skipping- it's not ready");
	}
  @AfterMethod
  public void getResult(ITestResult result) throws Exception {
  	if(result.getStatus()==ITestResult.FAILURE)
  	{
  		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"- Test case failed",ExtentColor.RED));
  		TakesScreenshot sht=(TakesScreenshot)driver;
  		File src=sht.getScreenshotAs(OutputType.FILE);
  		String path=System.getProperty("user.dir"+"/extent-reports/snapshots/"+result.getName()+".png");
  		System.out.println(path);
  		FileUtils.copyFile(src,new File(path));
  		logger.addScreenCaptureFromPath(path,result.getName());
  		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable()+"- Test case failed",ExtentColor.RED));
  	}
  	else if(result.getStatus()==ITestResult.SKIP)
  	{
  		logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"- Test case skipped",ExtentColor.ORANGE));
  	}
	
  }
  @AfterTest
  public void endreport() {
  	extent.flush();
	
  }
}

package TestNGListener;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenerImplementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		String Name = result.getName();
		Reporter.log(Name +"Execution started", true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		String Name = result.getName();
		Reporter.log(Name +"passed",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Random r = new Random();			// To create multiple screenshot files 
		int res = r.nextInt();
		System.out.println(res);
		String Name = result.getName();
		Reporter.log(Name +"Fail",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\janakaar\\eclipse java\\AdvancedSelenium\\Screenshot\\"+res+"img.png");
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

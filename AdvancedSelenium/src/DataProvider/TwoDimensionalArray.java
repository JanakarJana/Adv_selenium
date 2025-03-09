package DataProvider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionalArray {
	@Test(dataProvider = "subject")
	public void testcase(String subject, String Trainer, String asdf) {
		Reporter.log(subject,true);
		Reporter.log(Trainer,true);
		Reporter.log(asdf,true);
	}
	@DataProvider(name="subject")
	public String[][] testdata() {
		String[][] data = new String[1][3];
		
		data[0][0] = "java";
		data[0][1] = "shubham";
		data[0][2] = "asdf";
		
		/*data[1][0] = "manual";
		data[1][1] = "karthik";
		
		data[2][0] = "selenium";
		data[2][1] = "suriya";*/
		
		return data;
	}
}

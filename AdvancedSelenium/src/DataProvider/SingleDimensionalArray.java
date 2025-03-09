package DataProvider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDimensionalArray {
	@Test(dataProvider = "subject")
	public void testcase(String sub) {
		Reporter.log(sub,true);
	}
	
	@DataProvider(name="subject")
	public String[] testdata() {
		String[] s = new String[3];
		s[0]="Tamil";
		s[1]="English";
		s[2]="Maths";
		return s;
	}
}

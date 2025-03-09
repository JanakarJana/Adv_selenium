package CrossBrowser;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass extends BaseClass {
	@Test
	public void testcase() {
		Reporter.log("Execution done", true);
	}
}

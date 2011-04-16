

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class LoginDemo extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://webtesting.idyll.org/");
		selenium.start();
	}

	@Test
	public void testDemoCase() throws Exception {
		selenium.open("/");
		selenium.click("link=Log in");
		selenium.waitForPageToLoad("30000");
		selenium.click("create");
		selenium.waitForPageToLoad("30000");
		selenium.type("name", "Sean");
		selenium.type("username", "testit");
		selenium.type("password", "testing");
		selenium.click("create");
		selenium.waitForPageToLoad("30000");
		selenium.type("username", "testit");
		selenium.type("password", "testing");
		selenium.click("login");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("Welcome, testit"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

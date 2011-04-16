package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Banner Web Test Case extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testBanner Web Test Case() throws Exception {
package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Untitled extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Untitled extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/");
		selenium.click("css=input.default-text.DefaultText2676");
		selenium.click("css=em");
		selenium.waitForPageToLoad("30000");
		selenium.type("UserID", "cavanasm");
		selenium.type("css=input[name=PIN]", "Password");
		selenium.click("css=input[type=submit]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=table.menuplaintable > tbody > tr:nth(1) > td.mpdefault > a.submenulinktext2");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Schedule Lookup Page (NOT Live Data)");
		selenium.waitForPageToLoad("30000");
		selenium.type("id1", "cavanasm");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CSSE376-02"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

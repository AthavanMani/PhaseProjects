package in.Sauce.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Before_After extends Tools {
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

}

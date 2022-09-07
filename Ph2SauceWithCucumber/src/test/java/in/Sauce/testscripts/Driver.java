package in.Sauce.testscripts;
import org.openqa.selenium.chrome.ChromeDriver;

import in.sauce.pages.AddtoCartpage;
import in.sauce.pages.CheckoutComplete;
import in.sauce.pages.CheckoutOverview;
import in.sauce.pages.CheckoutPage;
import in.sauce.pages.ItemsPage;
import in.sauce.pages.LandingPageSauce;
import in.sauce.pages.MycartPage;



public class Driver extends Tools {
	
	protected static LandingPageSauce landingpagesauce;
	protected static ItemsPage itemspage;
	protected static AddtoCartpage addtocartpage;
	protected static MycartPage mycartpage;
	protected static CheckoutPage checkoutpage;
	protected static CheckoutOverview checkoutoverview;
	protected static CheckoutComplete checkoutcomplete;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
		driver = new ChromeDriver();
		landingpagesauce = new LandingPageSauce(driver);
		itemspage = new ItemsPage(driver);
		addtocartpage = new AddtoCartpage(driver);
		mycartpage = new MycartPage(driver);
		checkoutpage = new CheckoutPage(driver);
		checkoutoverview = new CheckoutOverview(driver);
		checkoutcomplete = new CheckoutComplete(driver);
		
	}
}

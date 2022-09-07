package in.sauce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MycartPage {
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbtn;
	
	public MycartPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void ClickonCheckout() {
		checkoutbtn.click();
	}
}

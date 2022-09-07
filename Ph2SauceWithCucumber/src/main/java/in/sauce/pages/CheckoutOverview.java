package in.sauce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutOverview {
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(id="finish")
	private WebElement FinishBtn;
	
	public CheckoutOverview(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait (driver,Duration.ofSeconds(30));
	}
	
	public void ClicksonFinish() {
		FinishBtn.click();
	}
	
	

}

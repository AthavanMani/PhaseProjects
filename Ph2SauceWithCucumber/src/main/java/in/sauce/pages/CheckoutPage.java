package in.sauce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement postalcode;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait (driver,Duration.ofSeconds(30));
	}
	
	public void Clicksonfirstname() {
		firstname.click();
	}
	
	public void EnterFirstName(String First_name ) {
		firstname.sendKeys(First_name);
	}
	
	public void ClickonLastName() {
		lastname.click();
	}
	
	public void EnterLastName(String Last_name) {
		lastname.sendKeys(Last_name);
	}
	
	public void ClickonPostalCode() {
		postalcode.click();
	}
	
	public void EnterPostalCode(String Postal_code) {
		postalcode.sendKeys(Postal_code);
	}
	
	public void ClickcontinueBtn() {
		continuebtn.click();
	}
	
	
}

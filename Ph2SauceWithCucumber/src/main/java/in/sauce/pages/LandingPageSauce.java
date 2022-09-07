package in.sauce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPageSauce {
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id = "login-button")
	private WebElement login;	
	
	public LandingPageSauce(WebDriver driver) {
		PageFactory.initElements(driver,this);
		actions = new Actions(driver);
	}

	public void ClickUsernameField() {
		username.click();
	}
	
	public void EnteruserName (String user_name) {
		username.sendKeys(user_name);
	}
	
	public void ClickPasswordField() {
		Password.click();
	}
	
	public void EnterPassword (String Pass_word) {
		Password.sendKeys(Pass_word);
	}
	
	public void ClickLogin() {
		login.click();
	}
	
	
		
}



package in.sauce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutComplete {

	Actions actions;
	WebDriverWait wait;
	
	@FindBy(xpath="//span[@class='title']")
	private WebElement Title;
	
	public CheckoutComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait (driver,Duration.ofSeconds(30));
	}
	
	public String getCompleteMsg() {
		wait.until(ExpectedConditions.visibilityOf(Title));
		String msg = Title.getText();
		return msg;
	}
	
}

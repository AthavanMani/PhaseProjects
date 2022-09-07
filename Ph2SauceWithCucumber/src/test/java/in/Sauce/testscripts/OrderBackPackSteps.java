package in.Sauce.testscripts;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderBackPackSteps extends Driver {
	String a;
	
	@Given("a user is on the landing page of Sauce")
	public void a_user_is_on_the_landing_page_of_sauce() {
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"));	   
	    // a=driver.getTitle();
	    //System.out.println(a);
	}

	@When("Clicks the Username field")
	public void clicks_the_username_field() {
		landingpagesauce.ClickUsernameField();
	}

	@And("Enter the UserName standarduser")
	public void enter_the_user_name_standarduser() {
	   landingpagesauce.EnteruserName("standard_user");
	}

	@And("Clicks the Password field")
	public void clicks_the_password_field() {
	   landingpagesauce.ClickPasswordField(); 
	}

	@And("Enter the Password  secretsauce")
	public void enter_the_password_secretsauce() {
	    landingpagesauce.EnterPassword("secret_sauce");
	}

	@And("He clicks Login Button")
	public void he_clicks_login_button() {
	    landingpagesauce.ClickLogin();
	}

	@And("He clicks on first Sauce Labs Backpack")
	public void he_clicks_on_first_sauce_labs_backpack() {
	    itemspage.ClickonSelectedItem();
	}

	@And("He clicks Add to Cart button")
	public void he_clicks_add_to_cart_button() {
	    addtocartpage.ClickonAddtoCart();
	}

	@And("He clicks on Cart symbol")
	public void he_clicks_on_cart_symbol() {
	    addtocartpage.ClickonCartbtn();
	}

	@And("He clicks on the Checkout button")
	public void he_clicks_on_the_checkout_button() {
	    mycartpage.ClickonCheckout();
	}

	@And("He clicks on FirstName field")
	public void he_clicks_on_first_name_field() {
	    checkoutpage.Clicksonfirstname();
	}

	@And("He Enters the FirstName on field")
	public void he_enters_the_first_name_on_field() {
	   checkoutpage.EnterFirstName("Raja");
	}

	@And("He clicks on LastName field")
	public void he_clicks_on_last_name_field() {
	    checkoutpage.ClickonLastName();
	}

	@And("He Enters the LastName on field")
	public void he_enters_the_last_name_on_field() {
		checkoutpage.EnterLastName("Mani");
	}

	@And("He clicks on PostalCode field")
	public void he_clicks_on_postal_code_field() {
	   checkoutpage.ClickonPostalCode();
	}

	@And("He Enters the PostalCode on field")
	public void he_enters_the_postal_code_on_field() {
	  checkoutpage.EnterPostalCode("560032");
	}

	@And("He clicks Continue button")
	public void he_clicks_continue_button() {
	   checkoutpage.ClickcontinueBtn();
	}
	
	@When("He clicks the Finish button")
	public void he_clicks_the_finish_button() {
	    checkoutoverview.ClicksonFinish();
	}


	@Then("he must able to order Backbag successfully")
	public void he_must_able_to_order_backbag_successfully() {
	   String expectedMsg = "CHECKOUT: COMPLETE!";
	   String actualMsg=checkoutcomplete.getCompleteMsg();
	   Assert.assertEquals(actualMsg, expectedMsg);
	
	}
	
	
}
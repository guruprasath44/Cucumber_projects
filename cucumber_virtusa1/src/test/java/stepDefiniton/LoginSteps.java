package stepDefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginSteps {
	@Given("the user is on the Home page")
	public void the_user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The user is on the Home Page");
	}

	@And("the user navigates to the Login page")
	public void the_user_navigates_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the user navigates to the Login page");
	}

	@And("the user enters username and password")
	public void the_user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the user enters username and password");
	}

	@Then("the successful login message is displayed with text")
	public void the_successful_login_message_is_displayed_with_text() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("You have successfully logged into your account! There are multiple discount offers waiting for you!!");
	}

}

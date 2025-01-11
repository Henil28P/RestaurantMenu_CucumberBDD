package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuManagementSteps {
	// Name of method doesn't matter
	// Each method has an annotation that contains text that matches text specified in the feature file scenario steps
	// Some values in "" in feature file scenario steps (such as "Cucumber sandwich" and 20) are extracted as method parameters (string, int) which are Cucumber expressions which can be available to be used in the method
	
	
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	    // Note: when running this, the moment it finds the Pending Exception, it will stop execution of that scenario
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}

package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import restaurantmenu.cucumberbddproject.RestaurantMenuItem;

public class MenuManagementSteps {
	// Name of method doesn't matter
	// Each method has an annotation that contains text that matches text specified in the feature file scenario steps
	// Some values in "" in feature file scenario steps (such as "Cucumber sandwich" and 20) are extracted as method parameters (string, int) which are Cucumber expressions which can be available to be used in the method
	
    // Create a restaurant menu item - and this will need us to create a class called RestaurantMenuItem Java class as it is not defined yet in src/main/java/restaurantmenu.cucumberbddproject directory of this project which will stay along with App.java class
	RestaurantMenuItem NewMenuItem; // make it a class field/attribute
	
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, Integer price) {
		// instantiate the RestaurantMenuItem for NewMenuItem field
		NewMenuItem = new RestaurantMenuItem(newMenuItemName, newMenuItemName, price); // the RestaurantMenuItem class will take 3 parameters (item name, description, price) to give to constructor
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

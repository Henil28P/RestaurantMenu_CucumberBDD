package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import restaurantmenu.cucumberbddproject.RestaurantMenu;
import restaurantmenu.cucumberbddproject.RestaurantMenuItem;

public class MenuManagementSteps {
	// Name of method doesn't matter
	// Each method has an annotation that contains text that matches text specified in the feature file scenario steps
	// Some values in "" in feature file scenario steps (such as "Cucumber sandwich" and 20) are extracted as method parameters (string, int) which are Cucumber expressions which can be available to be used in the method
	
    // Create a restaurant menu item - and this will need us to create a class called RestaurantMenuItem Java class as it is not defined yet in src/main/java/restaurantmenu.cucumberbddproject directory of this project which will stay along with App.java class
	RestaurantMenuItem NewMenuItem; // make it a class field/attribute
	RestaurantMenu LocationMenu = new RestaurantMenu(); // define and instantiate the class RestaurantMenu

	@Given("I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)") // change Cucumber Expressions of {int} to regular expressions such as ([0-9]+)
	// From above regex of ([0-9]+), it means any digit from 0 to 9 occurring atleast once or more times
	// The (\\d+) regex is a shorthand character that represents 0 to 9 (or numeric digits with \d) and an extra \ in front is an escape character
	// If the regex was to be ([0-9]{4}), it means any combination of digits from 0 to 9 exactly 4 times such as 1234 or 0000 or 9999 or 4321, etc would match
	// If the regex was to be ([0-9]*), it means occurrences of digits 0-9 zero or more times
	// ([$]*) regex means that the $ can occur 0 or more times in the feature file when mentioning price
	// {string} Cucumber Expression is replaced by \"([^\"]+)\" where \"...\" escape character accounts for getting rid of "" from Feature file and only getting the text between ""
	// The [^\"]+ - the ^ means anything other than the set of characters in the [] which in this case is "
	public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, String CurrencyType, Integer price) {
		// instantiate the RestaurantMenuItem for NewMenuItem field
		NewMenuItem = new RestaurantMenuItem(newMenuItemName, newMenuItemName, price); // the RestaurantMenuItem class will take 3 parameters (item name, description, price) to give to constructor
		System.out.println("Step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
		LocationMenu.addMenuItem(NewMenuItem); // to add the menu item which was just created earlier (a global class field)
		System.out.println("Step 2");
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
		boolean Exists = LocationMenu.DoesItemExist(NewMenuItem); // confirm if NewMenuItem added exists in arraylist in LocationMenu object of RestaurantMenu class
	    System.out.println("Step 3: " + Exists);
	}
}

package restaurantmenu.cucumberbddproject;

import java.util.ArrayList;

// This class is used in @When method of step definitions file
public class RestaurantMenu {

	// Below ArrayList holds an array list of restaurant menu items
	ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItems>();

	// To add a menu item to the above MenuItems array list
	public boolean addMenuItem(RestaurantMenuItem newMenuItem) throws IllegalArgumentException
	{
		return MenuItems.add(newMenuItem);
	}
}

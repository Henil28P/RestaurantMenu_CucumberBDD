package restaurantmenu.cucumberbddproject;

import java.util.ArrayList;

// This class is used in @When method of step definitions file
public class RestaurantMenu {

	// Below ArrayList holds an array list of restaurant menu items
	ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItem>();

	// To add a menu item to the above MenuItems array list
	public boolean addMenuItem(RestaurantMenuItem newMenuItem) throws IllegalArgumentException
	{
		return MenuItems.add(newMenuItem);
	}

	// Check if the Menu Item exists
	public boolean DoesItemExist(RestaurantMenuItem newMenuItem)
	{
		boolean Exists = false; // initialise Exists boolean variable to true initially
		if (MenuItems.contains(newMenuItem))
		{
			Exists = true; // set Exists to true if MenuItems ArrayList contains the newMenuItem from RestaurantMenuItem class
		}
		return Exists;
	}
}

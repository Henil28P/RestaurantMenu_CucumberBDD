package restaurantmenu.cucumberbddproject;

// Implementation is driver by step definitions, which is driver by our Feature file which ensures Test-first development
public class RestaurantMenuItem {
	// Add 3 attributes/fields to this class
	private String ItemName;
	private String Description;
	private int price;

	// Create a constructor for RestaurantMenuItem class
	public RestaurantMenuItem(String itemName, String description, int price) {
		super();
		ItemName = itemName;
		Description = description;
		this.price = price;
	}

	// Create getters and setters for each of the above 3 attributes
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return ItemName;
	}
	// Note: No setter for ItemName attribute because once an item is created with ItemNam, it cannot be changed later
}

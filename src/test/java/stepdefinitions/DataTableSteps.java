package stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DataTableSteps {
	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> BillData = dataTable.asMaps(String.class,String.class); // read the bill data table as a list
	    // A map is a collection of key-value pair (in this case both having data type of String

	    // Output the data from the above list of list of strings by using nested for loop (2 for loops)
	    for (Map<String,String> BillItems: BillData) // 1st loop will be a list of strings (BillItems)
	    {
	    	for (Map.Entry<String,String> BillItem: BillItems.entrySet()) // 2nd loop of BillItem to iterate over the list of strings (BillItems)
	    	{
	    		System.out.println("Key: " + BillItem.getKey()); // output each key of the map for each iteration
	    		System.out.println("Value: " + BillItem.getValue()); // output value of each key of the map for each iteration
	    	}
	    }
	}

	@When("I generate the bill")
	public void i_generate_the_bill() {

	}

	@Then("a bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {

	}
}

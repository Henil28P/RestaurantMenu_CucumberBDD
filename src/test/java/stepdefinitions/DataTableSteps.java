package stepdefinitions;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DataTableSteps {
	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> BillData = dataTable.asLists(String.class); // read the bill data table as a list

	    // Output the data from the above list of list of strings by using nested for loop (2 for loops)
	    for (List<String> BillItems: BillData) // 1st loop will be a list of strings (BillItems)
	    {
	    	for (String BillItem: BillItems) // 2nd loop of BillItem to iterate over the list of strings (BillItems)
	    	{
	    		System.out.println(BillItem); // output each data item on each iteration of item in BillData list
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

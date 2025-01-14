package stepdefinitions;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DataTableSteps {
	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
	    List<String> BillData = dataTable.asList(String.class); // read the bill data table as a list

	    // Output the data from the above list of strings
	    for (String BillItem: BillData)
	    {
	    	System.out.println(BillItem); // output each data item on each iteration of item in BillData list
	    }
	}

	@When("I generate the bill")
	public void i_generate_the_bill() {

	}

	@Then("a bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {

	}
}

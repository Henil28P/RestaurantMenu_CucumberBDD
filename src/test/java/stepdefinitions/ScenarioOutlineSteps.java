package stepdefinitions;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import restaurantmenu.cucumberbddproject.BillCalculationHelper;

public class ScenarioOutlineSteps {

	// Define fields as we want to share them between methods
	int InitialBillAmount;
	double TaxRate;

	@Given("I have a customer")
	public void i_have_a_customer() {

	}

	@Given("user enters initial bill amount as {int} # InitialBillAmount is a variable defined instead of value")
	public void user_enters_initial_bill_amount_as_InitialBillAmount_is_a_variable_defined_instead_of_value(Integer initialBillAmount) {
	    this.InitialBillAmount = initialBillAmount;
	    System.out.println("Initial Bill Amount: " + initialBillAmount);
	}

	@Given("Sales Tax Rate is {int} Percent")
	public void sales_Tax_Rate_is_Percent(Integer taxRate) {
	    this.TaxRate = taxRate;
	    System.out.println("Tax Rate: " + taxRate);
	}
	
	@Then("final bill amount calculate is {int}")
	public void final_bill_amount_calculate_is(Integer expectedValue) {
		double SystemCalcValue = BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
	    System.out.println("Expected Value: " + expectedValue);
	    System.out.println("System Calculated Value: " + SystemCalcValue);

	    // compare expected value with the system calculated value to see if both are equal, then test succeeds
	    assertTrue(expectedValue == SystemCalcValue);
	}
	
	@Given("Sales Tax Rate is {double} Percent")
	public void sales_Tax_Rate_is_Percent(Double taxRate) {
	    this.TaxRate = taxRate;
	    System.out.println("Tax Rate: " + taxRate);
	}

	@Then("final bill amount calculate is {double}")
	public void final_bill_amount_calculate_is(Double expectedValue) {
	    double SystemCalcValue = BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
	    System.out.println("Expected Value: " + expectedValue);
	    System.out.println("System Calculated Value: " + SystemCalcValue);

	    // compare expected value with the system calculated value to see if both are equal, then test succeeds
	    assertTrue(expectedValue == SystemCalcValue);
	}
}

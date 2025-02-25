Feature: Final Bill Calculation

@ScenarioOutlineExample
Scenario Outline: Customer Bill Amount Calculation # works almost same as Scenario keyword
Given I have a customer
And user enters initial bill amount as <InitialBillAmount> # InitialBillAmount is a variable defined instead of value
And Sales Tax Rate is <TaxRate> Percent
Then final bill amount calculate is <CalculateBillAmount>
# use all above variables in <> as headers of data table below in Examples
Examples:
|InitialBillAmount|TaxRate|CalculatedBillAmount|
|100							|10			|110								 |
|200							|8			|216								 |
|100							|1.55		|101.55							 |

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

# Feature files contain: Feature, Scenario, Steps (defined by Given ... (precondition), When ... (action), Then ... (result))
# Steps can also have the keyword “And” and “But” which represent additional preconditions, actions and results
# Note: there can be multiple scenarios in a feature file

Feature: Menu Management

# If the Background were to run before each scenario, we would have the 3 steps from the Background
# and 3 steps from each scenario, run 3 times
# Therefore, total of 6 tests will be run 3 times and a total of 18 tests will be executed (6x3)
Background: Add third menu item
Given I have a menu item with name "Cheese Sandwich" and price 15
When I add that menu item
Then Menu Item with name "Cheese Sandwich" should be added

@SmokeTest
Scenario: Add a menu item
Given I have a menu item with name "Cucumber sandwich" and price $20
#And I have another menu item with name "Cucumber Salad"
When I add that menu item
Then Menu Item with name "Cucumber sandwich" should be added

@RegularTest
Scenario: Add another menu item
Given I have a menu item with name "Cucumber Salad" and price 15
When I add that menu item
Then Menu Item with name "Cucumber Salad" should be added

@NightlyBuildTest @RegularTest
Scenario: Add third menu item
Given I have a menu item with name "Cheese Sandwich" and price 15
When I add that menu item
Then Menu Item with name "Cheese Sandwich" should be added

# Note: we need to implement step definitions for the above 3 methods (Given, When, Then)

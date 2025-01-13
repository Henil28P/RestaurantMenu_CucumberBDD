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

Scenario: Add a menu item
Given I have a menu item with name "Cucumber sandwich" and price $20
#And I have another menu item with name "Cucumber Salad"
When I add that menu item
Then Menu Item with name "Cucumber sandwich" should be added

Scenario: Add a menu item
Given I have a menu item with name "Cucumber Salad" and price 15
When I add that menu item
Then Menu Item with name "Cucumber Salad" should be added

# Note: we need to implement step definitions for the above 3 methods (Given, When, Then)

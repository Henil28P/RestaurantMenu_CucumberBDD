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

Feature: Data Tables

@ListofStrings
Scenario: Bill Amount Generation
Given I placed an order for the following items
|Cucumber Sandwich|2|20| # data supplied, in a tabular format in a single row without any headers - run some tests to generate method stubs for this step
When I generate the bill
Then a bill for $40 should be generated
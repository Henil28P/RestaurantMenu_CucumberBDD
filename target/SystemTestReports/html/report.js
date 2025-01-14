$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/restaurantmenu/cucumberbddproject/features/MenuManagement.feature");
formatter.feature({
  "name": "Menu Management",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Setup a menu item",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a menu item with name \"Cheese Sandwich\" and price 15",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cheese Sandwich\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber sandwich\" and price $20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cucumber sandwich\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Setup a menu item",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have a menu item with name \"Cheese Sandwich\" and price 15",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cheese Sandwich\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add another menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegularTest"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Salad\" and price 15",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu Item with name \"Cucumber Salad\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_Item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
});
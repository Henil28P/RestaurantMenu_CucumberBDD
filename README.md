# RestaurantMenu_CucumberBDD-WebApp
A BDD and TDD-focused project using Cucumber tool with Java web app and Maven dependency/build management for performing BDD tests on Restaurant Menu project.

# Basic concepts of BDD:
- Defines software behaviour collaboratively with concrete examples
- Facilitates software testing as it focuses on software behaviour from the perspective of well-understood and well-defined software features written in business language
- Focuses on concrete examples or well-defined business rules or scenarios.
- Test-first approach (just like TDD) where you implement a system feature after the test case of that feature is already written.

<h3>Traditional Requirements Analysis Techniques</h3>
1. <b>Software requirements specifications</b> - eg. system shall do something, user will do something style.<br>
2. <b>Use case</b> - set of user-system interaction to produce a business value.<br>
3. <b>User story</b><br>

<h3>TDD (Test-first approach):</h3>
- Write test case<br>
- Write code to fix compilation errors - test should still fail<br>
- Write code to satisfy test<br>
- Refactor and repeat<br>

<h3>3 key aspects of BDD</h3>
1. Are you working collaboratively? (business, implementation and testing stakeholders are working together)
2. Are you defining software features as concrete examples?
3. Test-first development

# Basic concepts of TDD and ATDD:
- <b>TDD</b> - Test-Driven Development<br>
- <b>ATDD</b> - Acceptance Test-Driven Development<br>

<h3>TDD:</h3>
- Developer-centric, Implementation centric and fine-graned approach<br>
- White-box testing<br>
- Follows paradigm of test-first approach<br>
- TDD Goals:<br>
1. Reduces the developers’ bias toward the quality of their code<br>
2. Answers the question - is my code working correctly?<br>

<h3>BDD:</h3>
- Test-first style just like TDD - extension of TDD<br>
- Works at a higher level of abstraction than TDD<br>
- Answers the question - have we covered all possible scenarios?<br>
- Explores the whys of user stories<br>
- Facilitates collaboration of the “3 amigos” of software development - business domain expert, developer, and QA SME<br>

<h3>ATTD:</h3>
- Slightly higher level of abstraction as compared to BDD<br>
- Answers the question - what should the system do so that it is usable and useful in production?<br>
- Focuses on requirements<br>
- Often used interchangeably with BDD<br>

<h3>Examples of TDD and ATDD</h3><br>
<b>User Story:</b> As an ATM user, I should be able to view my account balance.<br>
<br>
<b><i>TDD Examples:</b></i><br>
- PIN correctness check: regular expressions check for PIN, check for network connectivity, balance displayed format, incorrect PIN check, unreadable card<br>
- <b>Scope:</b> API methods<br>
- <b>Author(s):</b> developers<br>
<br>
<b><i>BDD Examples:</b></i><br>
- <b>Scenario 1:</b> display balance for correct PIN<br>
- <b>Scenario 2:</b> display error message for incorrect <br>
- <b>Scope:</b> the system or a subsystem<br>
- <b>Author(s):</b> developers, customers, business analysts, product owner, testers, QA automation engineers<br>
<br>
<b><i>ATDD Examples:</b></i><br>
- Can be identical to BDD or like:<br>
- Account balance inquiry<br>
- <b>Scope:</b> subset or superset of BDD scenarios<br>
- <b>Author(s):</b> customers, business analysts, product owner<br>

# Testing Life Cycle
- Define acceptance tests first <br>
- Define features - cover as many scenarios as possible; write BDD tests <br>
- Write unit tests (TDD cycle) in code <br>

# Project Iterations
1. Iteration 1:

- Software feature with simple scenarios<br>
- Understand basic concepts (feature file, step definitions, test runner)<br>
- Parameters passing with regular expressions<br>
- Hooks, tags and backgrounds<br>

2. Iteration 2:

- Practical scenario <br>
- More complex Cucumber features - scenario outline and parameter transformation <br>
- Hook step definitions to browser automation - with Selenium <br>
- SpecFlow for .NET developers (REST API call) <br>

# 3 key components of Cucumber:
1. <b>Feature files</b> - written in a domain-specific business language called Gherkin - this is the file in which we use simple business language to define software features or the desired behaviour of the software.
2. <b>Step definition files</b> - written in Java or any other.
- Each step of the feature file will be mapped to a method in the step definitions file.
3. <b>Test runner files</b> - just a test class based on a unit testing tool that glues the feature file and the step definitions file.
- This test runner file will be based on Java JUnit testing tool for Java projects.

# Examples of Cucumber components
1. <b>Example of feature:</b> Refund issuance
2. <b>Example of one of the scenario of above feature:</b> refund processing for an item that is not shipped yet.
3. <b>Example of steps for the above scenario:</b>
- Validating purchase order information
- Creating a refund transaction

# What does Cucumber do?
- Test automation tool that links scenario steps in the feature file to step definition methods.
- Step definitions can be run from test runner class (JUnit or TestNG)
- Step definitions test the system under test (SUT)

# Continuous Integration
- Invoke step definitions via test runner
- Can be integrated with the Build Tool (Maven) to enable continuous integration (CI) tool like Jenkins.

# Summary of BDD
- Advantage of concrete example - Concrete examples can be used as the basis to build automated test scenarios, Teams can build documentation with concrete examples and refer to it later for common understanding of requirements, and it helps clarify requirements.
- Incorrect statement about BDD or TDD - BDD is for the business analysts whereas TDD is only for developers. BDD is designed to be used by developers, requirement specialists, product owners, and QA team members. It is designed to facilitate collaboration among business and technical stakeholders. TDD is developer-centric, but the benefits of TDD are applicable to all stakeholders, not just developers.
- A feature file is NOT written in a high-level programming language. Instead, a feature file is written in a domain-specific language, such as Gherkin. It is designed to be understandable to technical and non-technical stakeholders.

# Cucumber Workflow
# 1. The system
- Eat More Cucumbers is a small but fast-growing restaurant chain
- Build a website for a restaurant chain
- User stories, such as set up locations, set up menu items and prices, generate bill, process payments, process online orders, analytics
- Users, such as managers, servers, online customers

# 2. The domain
- Problem domain - a list of business objects or business object types that we talk about in our focused area of our business problem.
- Example: Servers, bartender, chef, food item, payment, tax, gratuity, discount, inventory, and so on.

# 3. Key players
- 3 key stakeholder types participating in this user story workshop session:
1. Business stakeholders (Product Owner and Business Analysts),
2. Development team (lead software architect and key software developers),
3. Testers (QA Automation engineers).

# 4. User story
- As a manager, I should be able to add a menu item to my restaurant location’s menu.

# Feature File
- Need for a Feature File
1. Business specification document
- Business stakeholders, such as product owner, business analysis, end users
- Technical stakeholders, such as developers, architects, database administrators
- Quality assurance stakeholders, such as QA testers, testing automation engineers, usability testers.
2. Solution: Feature file
- Written in Gherkin domain-specific language (DSL)
3. Example of Gherkin feature file - MenuManagement.feature in the newly created “features” package

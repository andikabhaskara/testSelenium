README
=====

About The Project
------

---
This project aims as a training to conduct automation tests using Selenium by implementing
Page Object Model as a design pattern. Because, POM is a design pattern that has an 
object-oriented class orientation that focuses on the page we are testing.


### The advantages using POM:
- If there is a change in the UI on the page, then we as testers do not need to change the entire code,
  we can simply change the locators value without doing any duplication on code that will consume us lots of time
  and maintenance efforts.
- Our test code become much simpler and optimized as we are able to reuse method from our POM classes
- We could use more realistic method name that will be easily to read by other coder. For example, let say
you want to click a login button, we could name it `clickLoginButton();`
- By separating the locators from the page we want to test, our code becomes easier to manage 
without any dependency by applying the Single-Responsibility Principle
- by implementing Interface as the skeleton of each page then we can break a class which is too large into 
smaller parts that are more specific (Segregation Principle).
- Because the Page Object Model implements the Object-Oriented Class, both maintenance and code duplication can be
avoided by applying the Dependency Inversion Principle.
- By creating a BaseObject, we can store a generic method that can be extended or used on a more specific class
to perform an action on the page class (Open-Closed Principle).


How To Run
------

1. Open the CucumberRunner inside test > java > tests. Choose Tag Expression from .feature file that you want to run
2. Simply click run the test on line 16.
3. Alternatively you could directly run it but make sure you choose CucumberRunner as a runner


Depedency
------

---
1. Project Lombok = it is used to simply declare getter and setter with creating it
2. Selenium = Web Automation framework
3. webdrivermanager = to handle web driver (Firefox, Chrome, Safari etc)
4. snakeyaml = to handle a credential for every environment
5. appium = Native Automation Framework
6. Cucumber = BDD framework, to translate business approach into automation code


How to Install
------

---
- Project Lombok
   1. Go to Plugin on Intellij, search for Lombok
   2. Install project Lombok


- Cucumber +
  1. Go to Plugin on Intellij, search for Cucumber +
  2. Install Cucumber +


- Cucumber for Java
  1. Go to Plugin on Intellij, search for Cucumber for Java
  2. Install Cucumber for Java


- Gherkin
  1. Go to Plugin on Intellij, search for Gherkin
  2. Install Gherkin

Feature: CucumberJava
@smoke
Scenario Outline: Login functionality exists

Given I have open the browser
               
When I open Facebook website

When Enters Text "<Textt>"


Examples:
|Textt|
|Pooja|
|Bhavsar|

@o
Examples:
|Textt|
|Anil|
|Bhavsar|




 # this is what is written by the BA and given to developers and testers to work with the application
 Feature: Test the skillrary app
 1) valid case
 2) invalid case
 
 # i use background to work with common things which doesnt have any test steps
 Background:
 Given i should open the browser and navigate to the login page of skillrary
 
 # whatever we put in "" the value is passed to the application
 # it is like sendkeys
  
 Scenario: Validate Login with user credentials
 # used for valid credentials
 # @PositiveTesting   
 When Enter Name "user"
 And Enter Password "user"
 And Click on Login button
 Then i should see the username as "Harry Den"
 
 Scenario: to test the login with admin credentials
 When Enter Name "admin"
 And Enter Password "admin"
 And Click on Login button
 Then i should see the admin as "SkillRary Admin"
 
 # when i have to run multiple positive case then i use scenario outline
 # we will write a single scenario and add many data for which i have to run
 # Scenario Outline -- to test login with all positive data-- used when many positive data are there
 
 # Examples:
 # |user|password|name|
 # |user|user|Harry Den|
 # |user|user|Harry Den|
 # |admin|admin|SkillRary Admin|
 
 # @ stands for tags-- tags are used when we need to run only few methods out of many
 # used for invalid credentials
 # @NegativeTesting   
 Scenario: Validate Login with invalid credentials
 When Enter Name "sunil"
 And Enter Password "sunil"
 And Click on Login button
 Then i should navigate to the page as "Register"
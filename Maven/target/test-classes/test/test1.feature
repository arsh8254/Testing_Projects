 Feature: Test OrangeHRM
 Scenario: Test Login Functionality
 Given i should go to login page
 When enter username "Admin"
 And enter the password "admin123"
 And click on login button
 Then i should see the username as "OrangeHRM"
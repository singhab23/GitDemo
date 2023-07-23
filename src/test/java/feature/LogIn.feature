Feature: Application Login


Scenario: Home page default login
Given User is on Netbanking landing page
When User logs in to the application using the username "john" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on Netbanking landing page
When User logs in to the application using the username "jim" and password "4321"
Then Home page is populated
And Cards displayed are "false" 

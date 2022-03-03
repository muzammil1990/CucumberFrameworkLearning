#this is a scenario when multiple user has to login so do we need to create multiple step definition?
# Ans is NO.  how to handle then? check below
# Ans is Regular expression
Feature: Gmail login again

Scenario: Home Page is displayed by default when login
Given User is on netbanking landing page
When User logs into application using "John" and "1234"
Then Home page is displayed
And Cards displayed are "true"


Scenario: Home Page is displayed by default when login
Given User is on netbanking landing page
When User logs into application using "sean" and "4321"
Then Home page is displayed
And Cards displayed are "false"
Feature: Application Login

Scenario: Home Page is displayed by default when login
Given User is on netbanking landing page
When User logs into application using username and password
Then Home page is displayed
And Cards are displayed 
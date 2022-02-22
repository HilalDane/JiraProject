@OP-955
  Feature: User should be able to login

    Scenario: Login with valid credentials
      Given the user is on the login page
      When the user enters valid credentials
      Then the user should be able to login



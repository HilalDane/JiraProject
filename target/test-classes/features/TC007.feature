@OP-962 @wip
Feature: Print function
  Background:
    Given the user on the homepage
    When user clicks Services button
  Scenario: Print function
    When the user navigate back and clicks Lists button
    And the user clicks print button under Lists Page
    Then the user should be able to print the lists
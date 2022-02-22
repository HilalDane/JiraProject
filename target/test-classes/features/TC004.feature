@OP-959 @wip
Feature: Sorting Idea
  Background:
    Given the user on the homepage
    When user clicks Services button

  Scenario: User sorts the ideas by date added
    And the user clicks date added button
    Then the ideas must be sorted by date added
@OP-960 @wip
Feature: Sorting Idea using date added
  Background:
    Given the user on the homepage
    When user clicks Services button

  Scenario: User sorts the ideas by date added
    And the user clicks rating button
    Then the ideas must be sorted by rating
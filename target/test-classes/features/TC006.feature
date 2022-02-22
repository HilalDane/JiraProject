
Feature: Sorting Idea using rating
  Background:
    Given the user on the homepage
    When user clicks Services button
@OP-961 @wip
    Scenario: Creating new Category
      And user clicks New Category button
      And  user enters valid credentials
      Then new category should be created
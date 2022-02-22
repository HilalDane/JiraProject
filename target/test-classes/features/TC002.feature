
Feature: Dislike Idea
Background:
Given the user on the homepage
When user clicks Services button
  @OP-957 @wip
  Scenario: The User Dislikes Idea
    When the user clicks minus button
    Then the number of rating should be change
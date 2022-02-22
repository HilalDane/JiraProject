
Feature: Like Idea
  Background:
    Given the user on the homepage
    When user clicks Services button
   @OP-958 @wip
Scenario: User likes the Idea
  And the user clicks plus button
  Then the number of rating should be change
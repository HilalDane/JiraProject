Feature: User should be able to locate ServicesMenu

Background:
  Given the user on the homepage
    When user clicks Services button
@OP-956
        Scenario: Send new Idea
          When user clicks New Idea button
          When user enters sth as title
          And user enters sth as Idea description
          And user enter sth to Tags
          And user chooses any category
          And user clicks Add Step button
          Then user should be able to add step

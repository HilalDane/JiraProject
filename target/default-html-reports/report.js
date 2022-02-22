$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TC002.feature");
formatter.feature({
  "name": "Dislike Idea",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.ServicesStepDefs.the_user_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Services button",
  "keyword": "When "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.ServicesStepDefs.user_clicks_Services_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The User Dislikes Idea",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user clicks minus button",
  "keyword": "When "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.TC002StepDefs.the_user_clicks_minus_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the number of rating should be change",
  "keyword": "Then "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.TC002StepDefs.the_number_of_rating_should_be_change()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
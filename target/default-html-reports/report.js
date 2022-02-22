$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TC007.feature");
formatter.feature({
  "name": "Print function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OP-962"
    },
    {
      "name": "@wip"
    }
  ]
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
  "name": "Print function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OP-962"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user navigate back and clicks Lists button",
  "keyword": "When "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.TC002StepDefs.the_user_navigate_back_and_clicks_Lists_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks print button under Lists Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.TC002StepDefs.the_user_clicks_print_button_under_Lists_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to print the lists",
  "keyword": "Then "
});
formatter.match({
  "location": "com.openlyCrm.step_definitions.TC002StepDefs.the_user_should_be_able_to_print_the_lists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
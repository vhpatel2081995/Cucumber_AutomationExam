$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/List.feature");
formatter.feature({
  "name": "Listpage background color functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ListColourFeature"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "2 White Background Change",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ListColourFeature"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The \"\u003csetWhiteBackground\u003e\" button exists in \"SetWhiteBackground\" field",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ListStepDefination.the_button_exists_in_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"\u003csetWhiteBackground\u003e\" button in the \"SetWhiteBackground\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ListStepDefination.i_click_on_the_button_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The background color will change to \"\u003cwhite\u003e\" in the \"WhiteBackground\" field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListStepDefination.the_background_color_will_change_to_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});
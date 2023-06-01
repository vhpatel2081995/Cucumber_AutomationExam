@ListColourFeature @regression
Feature: Listpage background color functionality validation


@Smoke
Scenario:1 Sky Blue Background 
Given The "<setSkyBlueBackground>" button exists in "SetSkyBlueBackground" field
When I click on the "<setSkyBlueBackground>" button in the "SetSkyBlueBackground" field
Then The background color will change to "<sky blue>" in the "SkyBlueBackground" field

@scenario2
Scenario:2 White Background Change
Given The "<setWhiteBackground>" button exists in "SetWhiteBackground" field
When I click on the "<setWhiteBackground>" button in the "SetWhiteBackground" field
Then The background color will change to "<white>" in the "WhiteBackground" field


    #Examples: 
      #| name  | value |
      #| name1 |     5 | 
      #| name2 |     7 |

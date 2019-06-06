@SearchCarRegNo
Feature: Search Car Reg Number

  Scenario: I want to search car info

    Given I am on the Home Screen
    When I enter Car Registration Number
    And I click on Find Car
    Then I should get Car information
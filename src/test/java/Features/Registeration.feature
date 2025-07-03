Feature: Registration
  Scenario: user can register
    Given user go to website
    And close banner
    When user open register page
    And Fill registration form
    Then user successfully register
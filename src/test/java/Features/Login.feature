Feature: Login
    Scenario: user can login
        Given user go to website
        And close banner
        When user open login page
        And Fill login form
        And Enter credentials
        Then user successfully login
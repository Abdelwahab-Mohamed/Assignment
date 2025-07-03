Feature: Add to cart
    Scenario: user can add product to cart
        Given user go to website
        And close banner
      When user open login page
      And Fill login form
      And Enter credentials
      Then user successfully login
        And add product to cart
        Then product is added to cart
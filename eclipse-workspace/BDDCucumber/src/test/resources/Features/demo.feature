Feature: User Login

  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid credentials (username: "standard_user", password: "secret_sauce")
    And the user clicks on the Login button    
    Then the user should see logo

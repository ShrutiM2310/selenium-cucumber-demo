Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on login page
    When I enter user credentials
    Then I login successfully in the application

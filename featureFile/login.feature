Feature: User Login
  As a user
  I want to log in to the system
  So that I can access my account

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    And I click the login button
    Then I should be logged in

  Scenario: Unsuccessful login
    Given I am on the login page
    When I enter invalid credentials
    And I click the login button
    Then I should see an error message

@regression @ui @smoke
Feature: Validating Login Functionality

  @smoke  @loginPositive
  Scenario: Validating login functionality with valid credentials
    Given User navigates to application
    When User logs in with username and "Tester" and password "test"
    Then User is is successfully logged in and lands on the homepage


  @smoke  @loginNegative
    Scenario: Validating login functionality with invalid credentials
      Given  User navigates to application
      When User logs in with username and "test" and password "Tester"
      Then User validates error message "Invalid Login or Password."
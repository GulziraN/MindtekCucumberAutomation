 @regression @smoke @MB88-48

  Feature: Validation company


    Background: Setup for logging in company
      When Validating login functionality with valid credentials
      When User logged in with username "student@mindtekbootcamp.com" and password "ilovejava"
      Then User is successfully logged in


    @M88-49
    Scenario:Validation company information
      Given User creates company "Withards"
      When User validates created company exists
      And User changes MC number
      Then User validates if changed MC number exists in the database
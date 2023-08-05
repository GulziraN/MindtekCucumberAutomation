@regression @ui @elar @login

  Feature: Validating login functionality
    @smoke @login
    Scenario: Verify pagination functionality
      When Validating login functionality with valid credentials
      When User logged in with username "student@mindtekbootcamp.com" and password "ilovejava"
      Then User is successfully logged in


    @smoke @pagination
    Scenario: Verify pagination functionality
      When User clicks on companies button it will show tables with companies
      Given User on table page
      When User clicks the ">" pagination button
      Then User should be on the next page

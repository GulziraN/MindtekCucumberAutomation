@regression @ui @webOrders @orderCreation
Feature: Validating Order Creation

  Background:  Logging in
    Given User navigates to application
    When User logs in with username and "Tester" and password "test"
    And User clicks on Orders tab


  Scenario Outline: Validating discount calculator

    When User selects product "<product>" and quantity <quantity>
    Then User validates the price is correctly calculated for <quantity>
    Examples:
      | product      | quantity |
      | MyMoney      | 5        |
      | Family album | 10       |
      | ScreenSaver  | 15       |

    @placeOrder
  Scenario: Validating Order Creation functionality
    And User creates order with data
      | PRODUCT     | QUANTITY | CUSTOMER NAME | STREET     | CITY   | STATE         | ZIP   | CARD | CARD NUM  | EXP DATE |
      | ScreenSaver | 5        | Jane Doe      | 123 Lee st | Boston | Massachusetts | 12345 | Visa | 123456789 | 01/25    |
      | FamilyAlbum | 10       | Harsh Patel   | 123 Lee st | Boston | Massachusetts | 12345 | Visa | 123437890 | 06/25    |
    Then User validates success message "New order has been successfully added."
    And User validates created order is in the list of all orders.
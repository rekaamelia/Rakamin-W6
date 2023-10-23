Feature: Testing SauceDemo Website

  @Positive
  Scenario: Login to SauceDemo with valid credentials
    Given User is on the SauceDemo login page
    When User enters valid username and password
    And User clicks the Login button
    Then User should be logged in and see the product catalog

  @Negative
  Scenario: Login to SauceDemo with invalid credentials
    Given User is on the SauceDemo login page
    When User enters invalid username and password
    And User clicks the Login button
    Then User should see error message

  @Positive
  Scenario: Adding items to the cart
    Given User is logged in to the SauceDemo website
    When User adds multiple items to the cart
    Then User's cart should have the selected items

  @Positive
  Scenario: Completing a purchase
    Given User is logged in to the SauceDemo website
    When User goes to the cart and proceeds to checkout
    And User enters the shipping information
    And User completes the purchase
    Then User should receive an order success notification

  @Positive
  Scenario: Logout from SauceDemo
    Given User is logged in to the SauceDemo website
    When User clicks on the Logout button
    Then User should be logged out and redirected to the login page
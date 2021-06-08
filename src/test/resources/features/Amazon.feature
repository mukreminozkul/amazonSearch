@amazon
Feature: Amazon search feature

  @qabeginners
  Scenario: price verification after search term
    Given User is on the amazon home page
    When User searches qa testing for beginners in the search box
    When User clicks the first item
    Then User checks the price
    Then User clicks the checkout
Feature: Add remove item to cart
  In order to buy products
  Scenario: Add item to cart and verify it is added
    Given I add four random items to my cart
    When I view the cart
    Then I find total four items listed in my cart

  Scenario: Remove item with lowest price from cart and verify it is removed
    When I search for lowest price item
    And I am able to remove the lowest priced item from my cart
    Then I am able to verify three items are in my cart
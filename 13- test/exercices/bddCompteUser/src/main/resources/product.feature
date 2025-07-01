Feature: Product

  Scenario: customer search a product
    Given a customer want to search a product
    When the customer search a product
    Then the product is displayed

  Scenario: customer search by category
    Given a customer want to search a product by category
    When the customer search a product by category
    Then the product is displayed

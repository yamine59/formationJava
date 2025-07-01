Feature: User compte

  Scenario: Create a compte for user
    Given customer want to create or connect a compte
    When a compte is created for Customer "Michel"
    Then the compte is created "Michel"

  Scenario: Connect to a compte
    Given customer want to create or connect a compte
    When a compte is connected for Customer "Michel"
    Then the compte is connected for Customer "Michel"
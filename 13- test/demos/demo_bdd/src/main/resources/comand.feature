
  Feature: Command Ordering

    Scenario: Creation of an empty Command
      Given Customer "Michel" who want to command for someone
      When a command is make for someone
      Then there is no product in the command
      And the command come from Customer "Michel"

    Scenario: Creation of an empty Command
      Given Customer "Michel" who want to command for someone
      When a command is make for someone
      Then there is add 2 product and there is 2 product in the command
      And the command come from Customer "Michel"


  Feature: Command Ordering

    Scenario: Creation of an empty Command
      Given Customer "Michel" who want to command for someone
      When a command is make for someone
      Then there is no product in the command
      And the command come from Customer "Michel"

    Scenario: Creation of a Command with 2 product
      Given Customer "a" who want to command for someone
      When a command is make for someone
      And customer add 2 product in the command
      Then there are 2 product in the command
      And the command come from Customer "a"

    Scenario: Creation of a Command with 1 product and remove it
      Given Customer "m2i" who want to command for someone
      When a command is make for someone
      And customer add 1 product in the command
      And customer remove 1 product in the command
      Then there is no product in the command
      And the command come from Customer "m2i"
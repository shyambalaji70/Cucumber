Feature: Validate the automation site

  Scenario: Validate the generation of the Customer ID
   # Given User is on the login page
    When User enters the details and hits enter
    Then Check if customer ID is generated

  Scenario: Validate the generation of the Customer ID
   # Given User is on the login page
    When User enters the detail and hits enter
      | Shyam | Balaji | sb@gmail.com | Trichy | 9952702594 |
    Then Check if customer ID is generated

  Scenario: Validate the generation of the Customer ID
   # Given User is on the login page
   # When User enter the detail hits enter
    #  | fname   | Shyam        |
   #   | lname   | Balaji       |
    #  | email   | sb@gmail.com |
     # | address | Trichy       |
     # | Ph no   |   9952702594 |
   # Then Check if customer ID is generated

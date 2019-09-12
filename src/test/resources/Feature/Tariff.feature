Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Need to create a tariff plan
    Given User visits the tariff plan website
    And Click on Tariff plan option
    When Enters the details
    And Submits the details
    Then Tariff plan is generated

  Scenario: To add the Tariff Plan deatils
    Given User visits the tariff plan website
    And Click on Tariff plan option
    When Enters the details
      | 500 | 350 | 140 | 112 | 350 | 415 | 198 |
      | 300 | 400 | 310 | 100 | 156 | 156 | 138 |
    And Submits the details
    Then Tariff plan is generated

  Scenario: To add the Tariff Plan deatils
    Given User visits the tariff plan website
    And Click on Tariff plan option
    When Enters thee detail
      | rent | mins | Inter | sms | local | inters | charge |
      |  500 |  350 |   140 | 112 |   350 |    415 |    198 |
      |  300 |  500 |   200 | 600 |   156 |    156 |    138 |
    And Submits the details
    Then Tariff plan is generated

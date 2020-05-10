Feature: Addition feature
  I want to add two numbers

# Background - it is used for running continous common steps before every scenario in single feature.
#But  - it is used for contradictory statement with any other keyword statement such as Given When Then
#And - it is for multiple given, when and then

  Scenario Outline: Add two numbers <Numberone> , <Numbertwo> and Result <sum>
    Given I have two number <Numberone> and <Numbertwo>.
    When I add them
    Then Result should be <sum>

#Will be using scenario outline and examples together and it is for data driven testing for particular scenario.
    Examples: 
      | Numberone | Numbertwo | sum |
      |         5 |         8 |  13 |
      |         8 |         8 |  16 |
      |         9 |         8 |  17 |
      |         5 |        80 |  85 |
      |        51 |        81 | 132 |
      
      
 Scenario Outline: Add two numbers <Numberone> , <Numbertwo> and Result <sum>
    Given I have two integers <Numberone> and <Numbertwo>.
    When I add them
    Then Result should be <sum>

    Examples: 
      | Numberone | Numbertwo | sum |
      |         5 |         8 |  13 |
      |         8 |         8 |  16 |
      |         9 |         8 |  17 |
      |         5 |        80 |  85 |
      |        51 |        81 | 132 |   
      
      
      
 Scenario Outline: Add two numbers <Numberone> , <Numbertwo> and Result <sum>
    Given I have two coins <Numberone> and <Numbertwo>.
    When I add them
    Then Result should be <sum>

    Examples: 
      | Numberone | Numbertwo | sum |
      |         5 |         8 |  13 |
      |         8 |         8 |  16 |
      |         9 |         8 |  17 |
      |         5 |        80 |  85 |
      |        51 |        81 | 132 |   
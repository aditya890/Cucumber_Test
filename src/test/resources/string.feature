Feature: Addition feature
  I want to add two strings
Scenario Outline: Joining two strings <Stringone> , <Stringtwo> and Result <final>
    Given I have two strings "<Stringone>" and "<Stringtwo>".
    When I join them
    Then Final Value should be "<final>"

    Examples: 
      | Stringone | Stringtwo | final        |
      | aman      | garg      | amangarg     |
      | training  | rest      | trainingrest |
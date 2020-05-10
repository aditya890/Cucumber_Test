Feature: Addition feature
  I want to add two strings from datatable
#Datatable are basically for particular steps under scenario
  Scenario: Datatable example
    Given I have  datatable of two words
      | aman | garg |
    When I join two words
    Then It should match the following value
      | amangarg |
Feature: Addition feature
  I want to add three strings from datatable

Scenario: Datatable  With headers as maps example
    Given I have  datatable of three words for maps
      | firstname | lastname | thirdname |
      | aman      | garg     | testers   |
    When I join three words
    Then It should match the following value below
      | amangargtesters |
      
    Scenario: Multiple statements with same logic
    Given We have three word which are completely different.
      | firstname | lastname | thirdname |
      | aman      | garg     | testers   |
    When I join three words
    Then It should match the following value below
      | amangargtesters |
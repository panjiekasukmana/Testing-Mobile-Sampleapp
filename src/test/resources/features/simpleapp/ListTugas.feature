@list @android

  Feature: List Menu
    Scenario: Long press on list menu
      Given user already login
      When user go to list menu field
      And click long press in list ke-5
      Then Pop up notification appears


  Scenario: Multiple Times on list menu
    Given user already login
    When user go to list menu field
    And click multiple times in list ke-3
    Then Pop up notification appears
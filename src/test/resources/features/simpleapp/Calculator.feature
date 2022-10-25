@Calculator @android
  Feature: Calculator

    @tugas @positive
    Scenario: Subtract two positive numbers
      Given user already login
      When user input on angkaA is 30
      And user input on angkaB is 10
      And user click drop down button
      And user click minus button
      And user click equal button
      Then hasil should be substract 20

    @tugas @positive
    Scenario: Multiplication two positive numbers
      Given user already login
      When user input on angkaA is 6
      And user input on angkaB is 8
      And user click drop down button
      And user click time button
      And user click equal button
      Then hasil should be multiplication 48

    @tugas @positive
    Scenario: distribution two positive numbers
      Given user already login
      When user input on angkaA is 300
      And user input on angkaB is 20
      And user click drop down button
      And user click divided button
      And user click equal button
      Then hasil should be distribution 15

    @tugas @positive
    Scenario: adding two positive numbers
      Given user already login
      When user input on angkaA is 89
      And user input on angkaB is 10
      And user click drop down button
      And user click plus button
      And user click equal button
      Then hasil should be adding 99


      @tugas @positive
      Scenario: adding two negative numbers
        Given user already login
        When user input on angkaA is -10
        And user input on angkaB is -10
        And user click drop down button
        And user click plus button
        And user click equal button
        Then hasil should be adding negative numbers -20

    @tugas @positive
    Scenario: Subtract two negative numbers
      Given user already login
      When user input on angkaA is -20
      And user input on angkaB is -10
      And user click drop down button
      And user click minus button
      And user click equal button
      Then hasil should be substract negative numbers -10

    @tugas @positive
    Scenario: Multiplication two negative numbers
      Given user already login
      When user input on angkaA is -8
      And user input on angkaB is -9
      And user click drop down button
      And user click time button
      And user click equal button
      Then hasil should be multiplication negative number 72

    @tugas @positive
    Scenario: distribution two negative numbers
      Given user already login
      When user input on angkaA is -100
      And user input on angkaB is -20
      And user click drop down button
      And user click divided button
      And user click equal button
      Then hasil should be distribution negative number 5

    @tugas @positive
    Scenario: distribution with zero number in angkaB
      Given user already login
      When user input on angkaA is 100
      And user input on angkaB is 0
      And user click drop down button
      And user click divided button
      And user click equal button
      Then hasil should be distribution NaN

      @tugas @positive
        Scenario: adding desimal numbers
        Given user already login
        When user input on angkaAdesimal is 2.5
        And user input on angkaBdesimal is 4.2
        And user click drop down button
        And user click plus button
        And user click equal button
        Then hasil should be adding desimal number 6.7


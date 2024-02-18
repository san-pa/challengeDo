Feature: As the Book Keeper, I should be able to generate a Tax
  Relief Egress File from the UI


  Scenario: TC-001 Login into BookKeeper Page and Validate Relief Egress File from the UI

    Given I have a login credentials
    When  I navigate to baseurl in chrome browser for Bookkeeper
    Then  Check Relief Egress File

  Scenario: TC-002 Login into BookKeeper Page and Validate Relief Egress File  is processing from the UI

    Given I have a login credentials
    When  I navigate to baseurl in chrome browser Egress Tax Relief file process in progress
    When  no records generated only with footer

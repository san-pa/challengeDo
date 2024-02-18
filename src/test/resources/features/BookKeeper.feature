Feature: Validation of Relief Egress File from the UI by Bookkeeper

  As a Bookkeeper, I shall be able to generate Relief Egress File from the UI

  @Book
  Scenario: TC-001 Login into BookKeeper Page and Validate Relief Egress File from the UI

    Given I have a login credentials
    When  I navigate to baseurl in chrome browser for Bookkeeper
    Then  Check Relief Egress File
@Note
  Scenario: TC-002 Login into BookKeeper Page and Validate Relief Egress File  is processing from the UI

    Given I have a login credentials
    When  I navigate to baseurl in chrome browser Egress Tax Relief file process in progress
    When  no records generated only with footer

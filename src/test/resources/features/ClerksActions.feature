Feature: Addition of working class hero by Clerk

  As a Clerk ,I shall be able to add working hero's to the Database by using API and UI


  Scenario: TC-001 Addition of working class hero using wrong csv file from UI
    Given I have a valid csv file named "data.csv"
    When  I navigate to baseurl in chrome browser

  Scenario: TC-002 Addition of working class hero using valid csv file from UI
    Given I have a valid csv file named "working-hero"
    When  I navigate to baseurl in chrome browser
    Then  Clerks dashboard UI is shown

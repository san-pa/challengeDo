Feature: As Application allows the creation of a single working
  class hero via API call.

  Scenario: TC-001 Addition of Single Working class hero
    Given I set Headers for request
      |KEY         |VALUE|
      |Content-Type| application/json |

     When send POST request with headers
      Then response is success with status 200

  Scenario: TC-002  Already id exists in the database
    Given I set Headers for request
      | KEY          | VALUE            |
      | Content-Type | application/json |
    When POST request with headers with an existing id entry in database

    Scenario: As the system owner, I want to have an API that hits an
    external service’s API to find out if a working class hero owes money

      Given I am able to trigger getapi with params provided
      When  send Get with natid value  accept numeric values for header
      Then response is success with status 200







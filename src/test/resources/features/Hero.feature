Feature: Addition of working class hero
@run
  Scenario: TC-001 Addition of Single Working class hero
    Given I set Headers for request
      |KEY         |VALUE|
      |Content-Type| application/json |

     When send POST request with headers
  @run
  Scenario: TC-002  Already id exists in the database
    Given I set Headers for request
      | KEY          | VALUE            |
      | Content-Type | application/json |
    When POST request with headers with an existing id entry in database






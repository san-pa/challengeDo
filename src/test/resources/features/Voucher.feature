Feature: Addition of working class to check vouchers

  Scenario: TC-001 Addition of Single Working class voucher using  api

    Given get api request to check number of voucher for each customer
    When get api is triggered with parameters by person and type
    Then response with Payload as expected
    And status is 200 is expected






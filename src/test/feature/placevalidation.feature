Feature: Validating Place API's
@AddPlaceApi
  Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
    Given Add place payload with "<name>" "<language>" "<address>"
    When user called "AddPlaceAPI" with "POST" http request
    Then the API call is successful with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    Given Get place payload
    When user called "GetPlaceAPI" with "GET" http request
    Examples:
      | name      | language   | address                      |
      | Rushikesh | French-IN  | 29, side layout, cohen 09    |
      | Pankaj    | English-US | 45, Park Street, Pune        |
      | Raj       | Hindi-IN   | 10, MG Road, Bangalore       |

  @DeletePlaceApi
  Scenario: Verify if place is successfully deleted
    Given Delete place payload
    When user called "DeletePlaceAPI" with "DELETE" http request
    Then "status" in response body is "OK"

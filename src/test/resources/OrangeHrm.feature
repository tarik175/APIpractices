Feature: feature to test orangeHrm functionality

  Scenario:
    Given user logged in
    When user is in dashboard and clicks clock icon
    And user fills in the info and presses punch in
    Then Goes back to dashboard
    And clicks leave list
    Then approve any on the list, go back to dashboard
    And click on assign leave
    Then give yourself a leave
    Then logout

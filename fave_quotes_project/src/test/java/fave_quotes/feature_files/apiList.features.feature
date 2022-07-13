Feature: A description
  Description: Test the fave list endpoint

  #check that 25 quotes are return when the
  @List
  Scenario: Assert 25 quotes are returned from quotes endpoint
    Then number of quotes equals 25

    #Checking that all quotes tagged with giraffe return 2 results
  @List
  Scenario: Assert filter parameter works correctly
    Then all quotes returned contain "giraffe" are listed as 2

    #Checking that all quotes tagged with the tag job return 2 results
  @List
  Scenario: Assert filter parameter works correctly
    Then all quotes with the "job" "tag" are listed as 2

    #Check when adding 2 quotes the correct amount of quotes are returned
    #Then checking a quote is removed after unfave quote
  @List
  Scenario: Assert filter parameter works correctly
    When favourite quote "25569"
    And favourite quote "25568"
    Then all quotes with the "Fearghal" "user" are listed as 2
    And unfavourite quote "25569"
    Then all quotes with the "Fearghal" "user" are listed as 1

  @List
  Scenario: Assert hidden quotes are displayed correctly
    When quote "24569" is marked as hidden
    And for username "Fearghal" with password "Feargha1!" all hidden quotes "1" are listed as 1
    Then quote "24569" is marked as unhidden

  @List
  Scenario: Assert hidden quotes are displayed correctly when unhidden
    When quote "24569" is marked as hidden
    And for username "Fearghal" with password "Feargha1!" all hidden quotes "1" are listed as 1
    When quote "24569" is marked as unhidden
    Then for username "Fearghal" with password "Feargha1!" all hidden quotes "1" are listed as 0

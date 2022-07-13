Feature: A description
  Description: As a user I should be able to Create and save a new item from Free text or selecting an imtem from All / Service / Favourites and SNOMED tab and saving them

  @favourite
  Scenario: Assert user can login and favourite quote
    Then favourite quote "25569"

  @favourite
  Scenario: Assert user can login and unfavourite quote
    When favourite quote "25569"
    Then unfavourite quote "25569"

  @favourite
  Scenario: Assert correct code is displayed when quote isnt present
    When favourite quote "2551169" error code 404 is displayed
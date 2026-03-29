Feature: Test with API + DB + Selenium

  @wip
  Scenario: Check phones' price, check if this phone in DB, if not add it
    Given  I open Allo.ua page
    When  I search for IPhone price
    Then I going to DB to check if phone data exists in DB
    Then if dont, I insert phone's model and price in DB
    Then phone data in DB matches UI price
    Then Phone's model and price have been added to the DB



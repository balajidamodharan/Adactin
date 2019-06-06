
@tag
Feature: User book the hotel in adactin page
  

  @tag2
  Scenario Outline: User book the hotel by more values
    Given User login the adactin page "<username>" and "<password>"
    When User enter the details in search hotel page "<location>","<hotel>","<roomtype>","<numrooms>","<chechin>","<checkout>","<adtcount>" and "<chdcount>"
    And User enter the details in booking hotel page "<firstname>","<lastname>","<address>","<cardno>","<cardtype>","<expmonth>","<expyear>" and "<ccv>"
    Examples: 
    
      | username   | password | location | hotel       | roomtype | numrooms  | chechin    | checkout   | adtcount | chdcount | firstname | lastname | address | cardno           | cardtype | expmonth | expyear | ccv |
      | balaji29 | 9994746845   | Sydney   | Hotel Creek | Double   | 2 - Two | 04/06/2019 | 05/06/2019 | 2 - Two  | 1 - One  | Balaji | Damodharan | No:62/a old bazaar Street Arakkonam  | 1236547896321456 | VISA     | December |    2030 | 6755 |
     
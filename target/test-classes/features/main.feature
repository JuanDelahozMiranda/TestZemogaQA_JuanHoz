#labguage: en

  @step1
  Feature: As a customer, I want to search a cruiser and verified the trip information

    Scenario: the user starts the process to search trip
      Given A customer navigate to Homepage of cruisers
      When A customer selects a destiny and Duration
      Then A customer search the link of contact support on page
      Then A customer clicked on the search button



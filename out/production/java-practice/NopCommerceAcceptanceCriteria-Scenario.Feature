Feature: Demo Nopcommerce's topmenu acceptance criteria
  As a user, I would like to check acceptance criteria of Nopcommerce topmenu
  Background: User is on given URL
    When User type URL https://demo.nopcommerce.com
    And User click on Enter button
    Then User is on given URL

  Scenario: Verify that user can navigate to books category
    When User is on given URL
    And Click on Books tab on Top Menu
    Then User is navigated to book category page

  Scenario: Verify that user can see the Book category page with filters and list of product
    When User is on given URL
    And Click on Books tab on Top Menu
    And Check Filters and List Tab.
    Then Book category page is displayed with filters and list tabs

  Scenario: Verify that user can see 'sort by' filter on book Category page
    Given user is on Books category page
    When user is on Books category page
    And Check 'sort by' filter is present
    Then 'sort by' filter is available on Book category page

  Scenario: Verify that user can see 'Display' filter on book Category page
    Given user is on Books category page
    When user is on Books category page
    And Check 'Display' filter is present
    Then 'Display' filter is available on Book category page

  Scenario: Verify that user can see 'Grid' filter on book Category page
    Given user is on Books category page
    When user is on Books category page
    And Check 'Grid' filter is present
    Then 'Grid' filter is available on Book category page

  Scenario: Verify that user can see 'List' filter on book Category page
    Given user is on Books category page
    When user is on Books category page
    And Check 'List' filter is present
    Then 'List' filter is available on Book category page

  Scenario: Verify that user can see 'Name: A to Z' selection is present in 'Sort by' filter
    Given user is on Books category page
    When user is on Books category page
    And Check 'Sort by' filter
    And Check that 'Name: A to Z' selection is present
    Then 'Name: A to Z' selection is present in 'Sort by' filter

  Scenario: Verify that user can see 'Name: A to Z' is first option in 'Sort by' filter
    Given user is on Books category page
    When user is on Books category page
    And Check on  'Sort by' filter
    And Check that 'Name: A to Z' is first in order
    Then 'Name: A to Z' is first option in order

  Scenario: Verify that user can see 'Name: A to Z' Filter is functioning as expected(Note: Products are filtered in alphabetical order)
    Given user is on Books category page
    When user is on Books category page
    And Check on  'Sort by' filter
    And Select 'Name:A to Z' filter
    Then All products are displayed in alphabetical order









@AllyLoginPage
Feature: Ally Login tests


  @TC001 @AllyBank
  Scenario: TC001_Login to AllyBank Navigates to Checking Page
    Given user brings up the AllyBank HomePage
    When user clicks Checking and Savings
    Then the page title should be "Banking, Investing & Auto Finance | Ally"

  @TC002 @AllyBank
  Scenario: TC002_Login to AllyBank Navigates to CreditCard Page
    Given user brings up the AllyBank HomePage
    When user clicks Credit Card
    Then the page title should be "Banking, Investing & Auto Finance | Ally"


  @TC003 @AllyBank
  Scenario: TC001_Login to AllyBank Navigates to Investment and Retirement Page
    Given AllyBank Navigates to Investment and Retirement page
    When user clicks Investment and Retirement Page
    Then the page title should be "Banking, Investing & Auto Finance | Ally"

  @TC004 @AllyBank
  Scenario: TC001_Login to AllyBank Navigates to Auto Page
    Given AllyBank Navigates to Auto page
    When user clicks AllyBank Navigates to Auto Page
    Then the page title should be "Banking, Investing & Auto Finance | Ally"

  @TC005 @AllyBank
  Scenario: TC001_Login to AllyBank Navigates to About US Page
    Given AllyBank Navigates to Auto page
    When user clicks AllyBank Navigates to About US Page
    Then the page title should be "About Ally: Our Company, Investor Relations, Press Room, Careers | Ally"

  @TC006 @AllyBank
  Scenario: TC001_Login to AllyBank Navigates to Contact US Page
    Given AllyBank Navigates to Auto page
    When user clicks AllyBank Navigates to Contact US Page
    Then the page title should be "Contact Us: Customer Support & Other Contact Info | Ally"


  @TC007 @AllyBank
  Scenario: TC001_Login to AllyBank Navigates to Help Page
    Given AllyBank Navigates to Auto page
    When user clicks AllyBank Navigates to Help Page
    Then the page title should be "Ally Help Center: FAQs for Bank, Auto, Commercial & Financial | Ally"




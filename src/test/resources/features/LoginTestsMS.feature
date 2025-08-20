@LoginPage
Feature: Login tests


  @TC001 @HomePageHeaders @About
  Scenario: TC001_Login to medicaid.com and Navigates to About page
    Given MS Login About page is displayed
    When Navigates to Page page tittle with header
      | Page Header|
      | About |

  @TC002 @HomePageHeaders @Service
  Scenario: TC002_Login to medicaid.com and Navigates to Service page
    Given MS Login Services page is displayed
    When Navigates to Page page tittle with header
      | Page Header|
      | Services |

  @TC003 @HomePageHeaders @QualityLink
  Scenario: TC003_Login to medicaid.com and Navigates to Quality page
    Given MS Login Quality page is displayed
    When Navigates to Page page tittle with header
      | Page Header|
      | Value-Based Incentives |



  @TC004 @HomePageHeaders @LateBreakingNewsLink
  Scenario: TC004_Login to medicaid.com and Navigates to LateBreakingNews page
    Given MS Login LateBreakingNews page is displayed
    When Navigates to Page page tittle with header
      | Page Header|
      | Late Breaking News |


  @TC005 @HomePageHeaders @JobOpeningsLink
  Scenario: TC005_Login to medicaid.com and Navigates to JobOpenings page
    Given MS Login JobOpening page is displayed
    When Navigates to Page page tittle with header
      | Page Header|
      | MS Division of Medicaid Job Openings |


  @TC006 @HomePageHeaders @ContactLink
  Scenario: TC006_Login to medicaid.com and Navigates to ContactLink page
    Given MS Login ContactLink page is displayed
    When Navigates to Page page tittle with header
      | Page Header|
      | Contact |

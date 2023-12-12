Feature: Home Page Open
  Scenario: check Home Page opned
    user Enter Valid Product name
#    Given Enter Valid Product name
#    Then user search Phone
#    And  Select Iphone6

    Given user search Phone
    Then Select Iphone6
    And  Product page open
Feature: Post feature of facebook
  This will test post functionality at the user wall

  Scenario: Post a message on  user wall
    Given User should be logged and should be present at its own wall
    When I type the message in the box
    And I click on the post button
    Then The message should get posted


  Scenario: Post a video on user wall
    Given User should be logged and at its own wall
    When the user selects a video
    And click on send
    Then the video should be displayed on the wall
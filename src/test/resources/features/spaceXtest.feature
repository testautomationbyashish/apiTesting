Feature: Test SpaceX API

Scenario Outline: Validate SpaceX api responses
Given User sets base <url>
And user authenticates api request with <token>
When user sends request to get all the response information
Then user gets response with status <code>
Examples:
|url |token |code|
|  https://api.spacexdata.com/v4/capsules  |   spacex-key    |  200  |


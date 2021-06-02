Feature: Test SpaceX API

Scenario Outline: Validate SpaceX api responses
Given User sets base <url>
And user authenticates api request with <token>
When user sends request to get all the response information
Then user gets response with status <code>
And response includes the following
	| stages 	 	| 2				|
	| type				| rocket		|	
And response includes the following in any order
	| engines.thrust_sea_level.kN 		| 420		  |
	| engines.thrust_sea_level.lbf 	| 110000  |   
	| payloads.composite_fairing.height 	| 3.5			      |	
Examples:
|url |token |code|
| https://api.spacexdata.com/v4/rockets   |  spacex-key     |  200  |


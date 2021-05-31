# apiTesting

Project:
This is a demo project to implement testing for SpaceX APIs using the below libraries.

Tools/Framework/Libraries
JDK 13
Maven - build tool
TestNG, Junit - test runner
Cucumber - BDD/Gherkin style feature files
Rest assured - Rest api verification library
Postman - Test Frequent API calls

Verify JSON GET Request
Testing a simple response containing some JSON data.

Request URL: https://api.spacexdata.com/v4/company
Request Method: GET
Response Content-Type: application/json
Response Body:


    "headquarters": {
        "address": "Rocket Road",
        "city": "Hawthorne",
        "state": "California"
    },
    "links": {
        "website": "https://www.spacex.com/",
        "flickr": "https://www.flickr.com/photos/spacex/",
        "twitter": "https://twitter.com/SpaceX",
        "elon_twitter": "https://twitter.com/elonmusk"
    },
    "name": "SpaceX",
    "founder": "Elon Musk",
    "founded": 2002,
    "employees": 9500,
    "vehicles": 4,
    "launch_sites": 3,
    "test_sites": 3,
    "ceo": "Elon Musk",
    "cto": "Elon Musk",
    "coo": "Gwynne Shotwell",
    "cto_propulsion": "Tom Mueller",
    "valuation": 74000000000,
    "summary": "SpaceX designs, manufactures and launches advanced rockets and spacecraft. The company was founded in 2002 to revolutionize space technology, with the ultimate goal of enabling people to live on other planets.",
    "id": "5eb75edc42fea42237d7f3ed"
}
Status Code: 200 OK

Request not found by changing company to companies.
Request URL: https://api.spacexdata.com/v4/companies
Request Method: GET
Response Body:
{
  
}
Status Code: 404 Not Found


Testcases for Space-X API Testing
Reference documents is https://github.com/r-spacex/SpaceX-API/blob/master/docs/v4/README.md
1) When user does a GET query on baseurl https://api.spacexdata.com/v4 ; AuthType=APIKey; Key=spacex-key ;Add to Header ;he gets back a response with 200 OK status.
2) When user does a GET query on baseurl https://api.spacexdata.com/v4 AuthType=APIKey; Key=SomeRandomValue ;Add to Header ,he does not get back a response. Status code will be 401.
3) When user does a GET query on baseurl https://api.spacexdata.com/v3 , he gets no response. Only v4 is supported.
4) When user does a GET query on https://api.spacexdata.com/v4/company, he should get SpaceX company info. Check address state is "Califormia".
5) 


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
5) Validate the keys with the Min 1 letter and Max more than 256 letters in GET request of APIs.
6) Verify /query route gives more results for pagination.
7) Verify limit": 10 gives only 10 records in pagination results.
8) Verify totalPages": 1, gives only one page result in pagination query.
9) Verify if "hasPrevPage": false then this should be the first page of response.
10) Verify if "hasNextPage": false, then this should be the last page of api response.
11) Verify $text" and "$search" searches all text indexes in a collection. Check that all string fields get indexed
12) Verify the query "upcoming":true gives Next upcoming launch.
13) Verify the query sort":"flight_number":"asc" gives back all flights in ascending order of flight number
14) Verify the query limit: 50 gives only the top 50 records.
15) Verify the query page: 2 gives records of page 2.
16) Verify if date_precision is set to month then response should have correct month. Day can be neglected. For example if launch date is 15June2021 and date_precision is month then response having 2020-06-01T00:00:00.000Z is correct. But 2020-07-15T00:00:00.000Z is wrong.
17) Verify if date is date_utc then response should not have any other timezone except 00.00 hours
18) Verify if date is date_unix then response should not have any other timezone except 00.00 hours
19) Verify if date is date_local then response should be in local country timezone.
20) Verify if date net=true then in response launch date should not be lesser than the set date.
21) Verify Post request to create rocket https://api.spacexdata.com/v4/rockets with name,id and type in body creates a new rocket. User should be able to see this rocket in GET query.
22) Verify GET /capsules gives the list of all capsules.
23) Verify GET /capsules/123 gives the list of capsule 123.
24) Verify GET /capsules/NOtExisting should give result Not Found.
25) Verify POST /capsules/query should create new capsule.
26) Verify  if query is wrong in POST /capsules/query mongoose error is thrown 400 Bad Request.
27) Verify PATCH /capsules/:id updates an already existing capsule id.
28) Verify DELETE /capsules/9784 deletes an already existing capsule id 9784
29) Verify after Deleting id 9784 if user performs GET /capsules/9784 he gets Not Found.
30) 


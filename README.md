# apiTesting
Testcases for Space-X API Testing
Reference documents is https://github.com/r-spacex/SpaceX-API/blob/master/docs/v4/README.md
1) When user does a GET query on baseurl https://api.spacexdata.com/v4 ; AuthType=APIKey; Key=spacex-key ;Add to Header ;he gets back a response with 200 OK status.
2) When user does a GET query on baseurl https://api.spacexdata.com/v4 AuthType=APIKey; Key=SomeRandomValue ;Add to Header ,he does not get back a response. Status code will be 401.
3) When user does a GET query on baseurl https://api.spacexdata.com/v3 , he gets no response. Only v4 is supported.
4) When user does a GET query on https://api.spacexdata.com/v4/company, he should get SpaceX company info. Check address state is "Califormia".
5) 


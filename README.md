# apiTesting
Testcases for Space-X API Testing
Reference documents is https://github.com/r-spacex/SpaceX-API/blob/master/docs/v4/README.md
1) When user does a GET query on baseurl https://api.spacexdata.com/v4 and header= spacex-key ,he gets back a response with 200 OK status.
2) When user does a GET query on baseurl https://api.spacexdata.com/v4 and header= xyz ,he does not get back a response. Status code will be 401.
3) When user does a GET query on baseurl https://api.spacexdata.com/v3 , he gets no response. Only v4 is supported.


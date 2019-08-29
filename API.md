##### 1.createEmployee

Method : POST
URL : /parking/employee
Request body : {"employeeId":"001"}
Response body : CREATED
Response code:201 500           

##### 2.selectEmployeeList

Method : GET
URL :  /parking/employee
Request body : 
Response body :[{"employeeId":"001"}
                {"employeeId":"002"}]
Response code:200,500            

##### 3.createParkingLot

Method : POST
URL : /parking/parkingLot
Request body : {"parkingLotId":"1","capacity":100}
Response body :created
Response code:201 500            

##### 4.selectParkingLotList

Method : GET
URL : /parking/parkingLot
Request body : {}
Response body :[{"parkingLotId":"1","capacity":100}
                {"parkingLotId":"2","capacity":100}]
Response code:200,500      

##### 5.updateParkingLotsEmployeeId

Method : PATCH
URL : /parking
Request body : {"parkingLotId":"1"}
Response body :{"parkingLotId":"1","employeeID":"001" }
Response code:200,500        

##### 6.getParkingLotsByEmployeeId

Method : GET
URL : /parking
Request body : {"employeeID":"001"}
Response body :{"employeeID":"001",
                [{"parkingLotID":"1","parkingLotID":"2"}]
               }
Response code:200,500            
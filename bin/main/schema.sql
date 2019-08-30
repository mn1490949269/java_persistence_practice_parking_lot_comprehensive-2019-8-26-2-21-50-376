CREATE TABLE employee (
  employeeId VARCHAR(64) PRIMARY KEY,
  parkingLots VARCHAR(64) NOT NULL 
);
CREATE TABLE parkingLot (
  parkingLotId VARCHAR(64) PRIMARY KEY,
  employeeId VARCHAR(64) NOT NULL,
  capacity VARCHAR(64) NOT NULL,
  availablePositionCount VARCHAR(64) NOT NULL
);


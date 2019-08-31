CREATE TABLE employee (
  employeeId VARCHAR(64) PRIMARY KEY
);
CREATE TABLE parkingLot (
  parkingLotId VARCHAR(64) PRIMARY KEY,
  employeeId VARCHAR(64) NOT NULL,
  capacity VARCHAR(64) NOT NULL,
  availablePositionCount VARCHAR(64) NOT NULL
);


package tws.entity;

import java.io.Serializable;

public class ParkingLot  implements Serializable{
	private String parkingLotId;
	private String employeeId;
	private String capacity;
	private String availablePositionCount;
	
	public ParkingLot(String parkingLotId) {
		this.parkingLotId = parkingLotId;
	}
	public ParkingLot() {
	}
	
	
	public String getParkingLotId() {
		return parkingLotId;
	}
	public void setParkingLotId(String parkingLotId) {
		this.parkingLotId = parkingLotId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getAvailablePositionCount() {
		return availablePositionCount;
	}
	public void setAvailablePositionCount(String availablePositionCount) {
		this.availablePositionCount = availablePositionCount;
	}
	
	

}

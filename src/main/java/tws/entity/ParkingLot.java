package tws.entity;


public class ParkingLot{
	private String parkingLotId;
	private String employeeId;
	private String capacity;
	private String availablePositionCount;
	
	public ParkingLot(String parkingLotId) {
		this.parkingLotId = parkingLotId;
	}
	public ParkingLot() {
	}
	
	
	public ParkingLot(String parkingLotId, String employeeId, String capacity, String availablePositionCount) {
		super();
		this.parkingLotId = parkingLotId;
		this.employeeId = employeeId;
		this.capacity = capacity;
		this.availablePositionCount = availablePositionCount;
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

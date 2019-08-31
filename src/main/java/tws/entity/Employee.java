package tws.entity;

import javax.validation.constraints.NotNull;

public class Employee{
	
	
	@NotNull(message= "ID can't be null!")
    private String employeeId;
    //private String[] parkingLots; 
  

    public Employee() {
    }
    public Employee(String employeeId) {
    }


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	 
//	public String[] getParkingLots() {
//		return parkingLots;
//	} 
}

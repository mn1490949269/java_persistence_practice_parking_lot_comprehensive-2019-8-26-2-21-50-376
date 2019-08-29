package tws.entity;

import java.io.Serializable;

public class Employee  implements Serializable{
    private String employeeId;
    private String[] parkingLots; 
  

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
	public String[] getParkingLots() {
		return parkingLots;
	} 
}

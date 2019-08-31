package tws.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	
	/*
	 * 新增停车男孩
	 */
	public  Employee createEmployee(Employee employee) {
		String id = UUID.randomUUID().toString();
    	employee.setEmployeeId(id);
    			
		employeeMapper.createEmployee(employee);
		return employee;	
	}
	
	/*
	 * 查询停车男孩列表
	 */
	public  List<Employee> selectEmployeeList() {
		List<Employee>  employeeResult = employeeMapper.selectEmployeeList();
		return employeeResult;	
	}
	
	/*
	 * 新增停车场
	 */
	public  ParkingLot createParkingLot(ParkingLot parkingLot) {
		String id = UUID.randomUUID().toString();
		parkingLot.setParkingLotId(id);
		employeeMapper.createParkingLot(parkingLot);
		return parkingLot;	
	}
	
	/*
	 * 查询停车场列表
	 */
	public  List<ParkingLot> selectParkingLotList() {
		List<ParkingLot>  parkingLotResult = employeeMapper.selectParkingLotList();
		return parkingLotResult;	
	}
	
	/*
	 * 更新停车停车男孩管理的停车场
	 */
	public  void updateParkingLotsEmployeeId(String parkingLotId, ParkingLot parkingLot) {
		employeeMapper.updateParkingLotsEmployeeId(parkingLotId,parkingLot);  
	}
	
	/*
	 * 根据停车男孩ID查询停车场
	 */
	public  String[] getParkingLotsByEmployeeId(String employeeId) {
		String result[] = {} ;
		int i=0;
		List<ParkingLot>  parkingLots = employeeMapper.selectParkingLotList();
		for(ParkingLot item : parkingLots) {
			if(item.getEmployeeId() == employeeId) {
				result[i] = item.getParkingLotId();
				i++;
			}
		}
		
		return result;	
	}


}

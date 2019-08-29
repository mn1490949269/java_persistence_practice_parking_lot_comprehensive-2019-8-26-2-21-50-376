package tws.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        employeeMapper.createEmployee(employee);
        return ResponseEntity.created(URI.create("/parking/employee/" + employee.getEmployeeId())).body(employee);
    }
    
    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> selectEmployeeList() {
    	return ResponseEntity.ok(employeeMapper.selectEmployeeList());
    }
    
    @PostMapping("/parkingLot")
    public ResponseEntity<ParkingLot> createParkingLot(@RequestBody ParkingLot parkingLot) {
        employeeMapper.createParkingLot(parkingLot);
        return ResponseEntity.created(URI.create("/parking/parkingLot/" + parkingLot.getEmployeeId())).body(parkingLot);
    }
    
    @GetMapping("/parkingLot")
    public ResponseEntity<List<ParkingLot>> selectParkingLotList() {
    	return ResponseEntity.ok(employeeMapper.selectParkingLotList());
    }
    
   
    @PutMapping("/{parkingLotId}")
    public ResponseEntity<ParkingLot> updateParkingLotsEmployeeId(@Param("parkingLotId") String parkingLotId, @RequestBody ParkingLot parkingLot){
    	employeeMapper.updateParkingLotsEmployeeId(parkingLotId,parkingLot);
    	return ResponseEntity.ok(parkingLot);
    }
    
    @GetMapping
    public ResponseEntity<Employee> getParkingLotsByEmployeeId(@Param("employeeId") String employeeId) {
    	return ResponseEntity.ok(employeeMapper.getParkingLotsByEmployeeId(employeeId));
    }
}


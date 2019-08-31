package tws.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
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
import tws.service.EmployeeService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee employeeResult = employeeService.createEmployee(employee);
        return ResponseEntity.created(URI.create("/employees" + employeeResult.getEmployeeId())).body(employeeResult);
    }
    
    @GetMapping("")
    public ResponseEntity<List<Employee>> selectEmployeeList() {
    	return ResponseEntity.ok(employeeService.selectEmployeeList());
    }
    
    @PostMapping("/parkingLots")
    public ResponseEntity<ParkingLot> createParkingLot(@RequestBody ParkingLot parkingLot) {
        ParkingLot parkingLotResult = employeeService.createParkingLot(parkingLot);
        return ResponseEntity.created(URI.create("/employees/parkingLots" + parkingLotResult.getEmployeeId())).body(parkingLotResult);
    }
    
    @GetMapping("/parkingLots")
    public ResponseEntity<List<ParkingLot>> selectParkingLotList() {
    	return ResponseEntity.ok(employeeService.selectParkingLotList());
    }
    
   
    @PutMapping("/{parkingLotId}")
    public ResponseEntity<ParkingLot> updateParkingLotsEmployeeId(@Param("parkingLotId") String parkingLotId, @RequestBody ParkingLot parkingLot){
    	employeeService.updateParkingLotsEmployeeId(parkingLotId,parkingLot);
    	return ResponseEntity.ok(parkingLot);
    }
    
    @GetMapping("/parkingLotsOfEmployee")
    public ResponseEntity<String[]> getParkingLotsByEmployeeId(@Param("employeeId") String employeeId) {
    	return ResponseEntity.ok(employeeService.getParkingLotsByEmployeeId(employeeId));
    }
}


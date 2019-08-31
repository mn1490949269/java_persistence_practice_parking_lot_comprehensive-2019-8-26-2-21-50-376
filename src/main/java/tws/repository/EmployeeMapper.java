package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Employee;
import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface EmployeeMapper {
 
   void createEmployee(@Param("employee") Employee employee);
   List<Employee> selectEmployeeList();
   
   void createParkingLot(@Param("parkingLot") ParkingLot parkingLot);
   List<ParkingLot> selectParkingLotList();
   
   int updateParkingLotsEmployeeId(@Param("parkingLotId") String parkingLotId, @Param("parkingLot") ParkingLot parkingLot);
   //Employee getParkingLotsByEmployeeId(@Param("employeeId") String employeeId);
   
   
}

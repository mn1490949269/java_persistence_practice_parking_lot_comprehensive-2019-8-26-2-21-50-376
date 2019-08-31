package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.Employee;
import tws.entity.ParkingLot;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@MybatisTest
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "employee");
    }

    @Test
    public void selectEmployeeList() {
        // given
        jdbcTemplate.execute("INSERT INTO employee VALUES('1')");
        // when 查询
        List<Employee> employeeList = employeeMapper.selectEmployeeList();
        // then
        assertEquals(1, employeeList.size());
    }
    
    @Test
    public void createEmployee() {
        // given
        Employee employee = new Employee();
        employee.setEmployeeId("2");
        
        // when
        employeeMapper.createEmployee(employee);
        // then
        int count = JdbcTestUtils.countRowsInTable(jdbcTemplate,"employee" );
		assertEquals(1, count); 
    }
    
    @Test
    public void createParkingLot() {
        // given
        ParkingLot parkingLot = new ParkingLot("001","1","100","99");
        
        // when
        employeeMapper.createParkingLot(parkingLot);
        // then
        int count = JdbcTestUtils.countRowsInTable(jdbcTemplate,"parkingLot" );
		assertEquals(1, count); 
    }
    
    @Test
    public void selectParkingLotList() {
        // given
        jdbcTemplate.execute("INSERT INTO parkingLot VALUES('001','1','100','99')");
        jdbcTemplate.execute("INSERT INTO parkingLot VALUES('002','1','80','67')");
        // when 查询
        List<ParkingLot> parkingList = employeeMapper.selectParkingLotList();
        // then
        assertEquals(2, parkingList.size());
    }
    
//    @Test
//    public void updateParkingLotsEmployeeId() {
//        // given
//    	ParkingLot parkingLot = new ParkingLot("001","1","100","99");        
//    	String id = "2";
//        // when 查询
//        int res = employeeMapper.updateParkingLotsEmployeeId(id,parkingLot);
//       
//        // then
//        assertEquals(1, res);
//    }
    
    
}

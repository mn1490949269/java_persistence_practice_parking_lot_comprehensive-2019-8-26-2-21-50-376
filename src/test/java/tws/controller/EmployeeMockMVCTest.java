package tws.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeMockMVCTest {
	@Autowired 
	MockMvc mockMvc;

	@Test
	public void should_return_employee_when_create_a_new_employee() throws Exception {
		mockMvc.perform(post("/employees")
			   .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
			   .content("{\"employeeId\":\"1\"}"))
			   .andDo(print())
		       .andExpect(status().isCreated());
		
               
	}
	
	@Test
	public void should_return_employeeList_when_given_a_get_request_employees() throws Exception {
		mockMvc.perform(get("/employees"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string("[]"));
	}
	

		


}

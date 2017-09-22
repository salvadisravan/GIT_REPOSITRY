package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.beans.Employee;
import com.infy.repository.EmployeeRepository;
import com.infy.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository EmployeeRepository;
	
	
	
	 @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)  
	 public Employee getEmployees(@PathVariable int id) {
		 System.out.println("In controller GET");
	        return employeeService.getEmployeeById(id);
	
	

}
}

package com.infy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.beans.Employee;
import com.infy.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	
	public Employee getEmployeeById(int id) {
		
		Employee emp=employeeRepository.getEmployeeById(id);
		
		return emp;
	}
	

}

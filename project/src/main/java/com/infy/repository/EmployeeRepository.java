package com.infy.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infy.repository.EmpRowMapper;
import com.infy.beans.Employee;


@Repository
public class EmployeeRepository {
	
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public Employee getEmployeeById(int id) {
		System.out.println("In repo");
		String query="Select * from employee where empId="+id;
		return jdbcTemplate.queryForObject(query,new EmpRowMapper());
		
	}

	
	
}

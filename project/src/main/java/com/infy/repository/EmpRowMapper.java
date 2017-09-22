package com.infy.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.infy.beans.Employee;
public class EmpRowMapper  implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt(1));
		employee.setEmpName(rs.getString(2));
		employee.setAge(rs.getInt(3));
		employee.setDesignation(rs.getString(4));
		System.out.println("bhsdbfvhsbkd");
		System.out.println("EMp ID is : " +employee.getEmpId());
		System.out.println("EMp Name is : "+ employee.getEmpName());
		System.out.println("EMp Age is : " +employee.getAge());
		System.out.println("EMp Designation is : " +employee.getDesignation());
		return employee;
	}

}

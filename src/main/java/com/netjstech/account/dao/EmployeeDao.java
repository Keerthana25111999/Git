package com.netjstech.account.dao;

import java.util.List;

import com.netjstech.account.dto.Employee;

public interface EmployeeDao {
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeesByDept();
	public void deleteEmployee(Employee emp);
	public void insertEmployeeWithValues();
	public void insertEmployee();

}

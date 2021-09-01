package com.netjstech.account.service;

import java.util.List;

import com.netjstech.account.dao.EmployeeDao;
import com.netjstech.account.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao)
	{
		this.empDao=empDao;
	}
	public Employee getEmployeeById(int empId)
	{
		Employee empl=empDao.getEmployeeById(empId);
		return empl;
	}
	public List<Employee> getEmployees(){
		System.out.println("Service -In getEmployees");
		List<Employee> empList=empDao.getEmployees();
		return empList;
	}
	public List<Employee> getEmployeeByDept(){
		return null;
	}
	/*public void deleteEmployeeByDept(int empId)
	{
		Employee emp  = empDao.findEmployeeById(empId);
		if(emp != null)
		{
			empDao.deleteEmployee(emp);
		}else {
			throw new IllegalArgumentException("Employee ID not found");
		}
	}*/

	/*	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	public void insertEmployeeWithValues()
	{
		empDao.insertEmployeeWithValues();
	}
	
	public void insertEmployee() {
		empDao.insertEmployee();
		
	}
}


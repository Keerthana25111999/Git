package com.netjstech.account;

import java.time.LocalDate;


import com.netjstech.account.dao.EmployeeDao;
import com.netjstech.account.dao.EmployeeDaoImpl;
import com.netjstech.account.dto.Employee;
import com.netjstech.account.service.EmployeeService;
import com.netjstech.account.service.EmployeeServiceImpl;

public class EmployeeDriver {
	Employee emp;
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		EmployeeService employeeService =new EmployeeServiceImpl(employeeDao);
		
		Employee empl = new Employee();
		empl.setEmpNo(9);
		empl.setEmpName("Rajini");
		empl.setSalary(23000);
		empl.setJob("Accountant");
		empl.setMgr(2);
		empl.setHireDate(LocalDate.of(2019,  6,  23));
		empl.setDeptNo(2);
		
		
		//List<Employee>emplist=employeeService.getEmployees();
		//System.out.println("Back with Employee List - "+emplist.size());
		//for(Employee employee:emplist)
		//{
			//System.out.println(employee);
		//}
		employeeService.insertEmployee(empl);
		//employeeService.insertEmployeeWithValues();
		
	}

}

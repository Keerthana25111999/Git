package com.netjstech.account.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.netjstech.account.dto.Employee;

public  class EmployeeDaoImpl implements EmployeeDao {
	/*List<Employee> empList=new ArrayList<Employee>();
	public List<Employee> getEmployees()
	{
		System.out.println("Dao - in getEmployees");
		Employee employee=new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("hemant");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(80000);
		employee.setJob("Developer");
		empList.add(employee);
		employee=new Employee();
		employee.setEmpNo(2);
		employee.setEmpName("varsha");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(10000);
		employee.setJob("Developer");
		empList.add(employee);
		return empList;
		
		
	}*/
	public Employee findEmloyeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Employee> findEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	public void insertEmployeeWithValues()
	{
		Connection conn = null;
		try {
			conn = DBUtil.getDBConnection();
			Statement stmt = conn.createStatement();
			
			int count = stmt.executeUpdate("insert into empl values(5, 'Sachin', 50000, 'Sales', 2, '12-Jan-2010', 12, 4)");
			System.out.println("Recor is inserted syccessfully!! "+count);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			if(conn!=null)
			{
				try {
					conn.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	public void insertEmployee(Employee e)
	{
		Connection conn = null;
		try {
		conn = DBUtil.getDBConnection();
		String sql = "insert into empl values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,  e.getEmpNo());
		pstmt.setString(2,  e.getEmpName());
		pstmt.setDouble(3, e.getSalary());
		pstmt.setString(4, e.getJob());
		pstmt.setInt(5, e.getMgr());
		pstmt.setDate(6, Date.valueOf(e.getHireDate()));
		pstmt.setDouble(7, 0.0);
		pstmt.setInt(8, e.getDeptNo());
		int count = pstmt.executeUpdate();
		System.out.println("Record is inserted successfully!!");
		
		
		
	}catch(SQLException exp)
		{
		exp.printStackTrace();
		}
	}
	@Override
	public void insertEmployee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

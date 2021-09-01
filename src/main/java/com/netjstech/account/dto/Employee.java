package com.netjstech.account.dto;

import java.time.LocalDate;

public class Employee {
    private int empNo;
    private String empName;
    private String job;
    private int mgr;
    private int deptNo;
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	private LocalDate hireDate;
	private double salary;
	private String deptName;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
		
	}
	@Override
	public String toString()
	{
		return getEmpNo() + " " + getEmpName() + " " + getSalary()+ " " +getJob()+ " " +getMgr()+ " "+getHireDate() + " "+getDeptNo();
	}

}

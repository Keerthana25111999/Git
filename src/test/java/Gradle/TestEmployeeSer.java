package Gradle;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.netjstech.account.dao.EmployeeDao;
import com.netjstech.account.dto.Employee;
import com.netjstech.account.service.EmployeeService;
import com.netjstech.account.service.EmployeeServiceImpl;

public class TestEmployeeSer {
	static EmployeeService employeeService = null;
	static EmployeeDao mockEmployeeDao = null;
	private static Employee emp1;
	private static Employee emp2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		mockEmployeeDao = Mockito.mock(EmployeeDao.class);
		employeeService = new EmployeeServiceImpl(mockEmployeeDao);
		emp1 = new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("Hemant");
		emp1.setHireDate(LocalDate.of(2018,  11, 22));
		emp1.setSalary(80000);
		emp1.setJob("Developer");
		emp2 = new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("Varsha");
		emp2.setHireDate(LocalDate.of(2016,  07, 02));
		emp2.setSalary(10000);
		emp2.setJob("Manager");
		Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1, emp2));
		
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception
	{
		
	}
	@BeforeEach
	void setUp() throws Exception
	{
		
	}
	@AfterEach
	void tearDown() throws Exception
	{
		
	}
	@Test
	void getAllEmployeestest()
	{
		List<Employee> allEmployees = employeeService.getEmployees();
		assertNotNull(allEmployees);
		assertEquals(2, allEmployees.size());
	}
	

}

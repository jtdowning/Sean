package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	
		private Employee employee; 
	
		@Before
		public void setup() {
			//Arrange
			employee = new Employee(111111, "Gotamin", "Spades", 10000.00);
		}
		
		@Test
		public void employee_initialized_correctly() {
			Assert.assertEquals("employeeId should equal 111111", 111111, employee.getEmployeeId());

			Assert.assertEquals("lastName should equal Spades", "Spades", employee.FullName());
			Assert.assertEquals("annualSalary should equal 10000.00", 10000.00, employee.getAnnualSalary(), 0.0009);
			Assert.assertEquals("department should equal null", null, employee.getDepartment());
		}


		@Test
		public void employee_setters_work_correctly_happy_path() {
			// Act
			
			
			Assert.assertEquals("employeeId should equal 111112", 111112, employee.getEmployeeId());
			Assert.assertEquals("firstName should equal Snake", "Snake", employee.FirstName());
			Assert.assertEquals("lastName should equal Plisken", "Plisken", employee.LastName());
			Assert.assertEquals("annualSalary should equal 1000000.00", 1000000.00, employee.getAnnualSalary(), 0.0009);
			Assert.assertEquals("department should equal Loss Prevention", "Loss Prevention", employee.getDepartment());
		}
		
		@Test
		public void employee_setters_work_correctly_sad_path() {
			// Arrange
			
			
			Assert.assertEquals("employeeId should equal 1111121111", 1111121111, employee.getEmployeeId());
			Assert.assertEquals("firstName should equal Gotamin", "Gotamin", employee.FirstName());
			Assert.assertEquals("lastName should equal Spades", "Spades", employee.LastName());
			Assert.assertEquals("annualSalary should equal 10000.00", 10000.00, employee.getAnnualSalary(), 0.0009);
			Assert.assertEquals("department should equal null", null, employee.getDepartment());
		}
		
		@Test
		public void return_correct_first_name() {
			// Act
			String fullName = employee.FullName();
			
			// Arrange
			Assert.assertEquals("fullName should return Spades, Gotamin", "Spades, Gotamin", employee.fullName());
		}
		
		@Test
		public void set_salary_below_zero() {
			// Act
			employee.AnnualSalary(-1);
			
			// Assert
			Assert.assertEquals("annualSalary cannot be set less than 0, should equal 10000.00", 10000.00, employee.getAnnualSalary(), 0.0009);
		}
		
		@Test
		public void raise_salary_50_percent() {
			// Act
			employee.raiseSalary(50);
			
			// Assert
			Assert.assertEquals("annualSalary should equal 15000.00 after raise", 15000.00, employee.getAnnualSalary(), 0.0009);
		}
		
		@Test
		public void raise_salary_300_percent() {
			// Act
			employee.raiseSalary(300);
			
			// Assert
			Assert.assertEquals("annualSalary should equal 40000.00 after raise", 40000.00, employee.getAnnualSalary(), 0.0009);
		}
		
		@Test
		public void raise_salary_negative_50_percent() {
			// Act
			employee.raiseSalary(-50);
			
			// Assert
			Assert.assertEquals("Cannot raiseSalary to negative percent, annualSalary shoudl remain 10000.00", 10000.00, employee.getAnnualSalary(), 0.0009);
		}
	}



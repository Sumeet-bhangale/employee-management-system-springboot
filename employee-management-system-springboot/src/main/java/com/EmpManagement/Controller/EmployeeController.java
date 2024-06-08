package com.EmpManagement.Controller;

import com.EmpManagement.Entity.Employee;
import com.EmpManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	// Add Employee
	@PostMapping("/addEmployees")
	public void addEmployees(@RequestBody Employee employee) {

		employeeService.addEmployee(employee);
	}

	
	// Get all Employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	
	// Find By Id
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	
	// Update Employee Details
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee emp) {

		return employeeService.updateEmployeeById(id, emp);
	}

	
	// Delete Employee By Id
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployeeByID(id);
	}
}

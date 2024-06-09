package com.EmpManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmpManagement.Entity.Department;

import com.EmpManagement.Service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// Add Department
	@PostMapping("/departments")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
	}

	// Get All Departments
	@GetMapping("/departments")
	public List<Department> getAllDepartment() {
		return departmentService.getAllDepartments();
	}
	
	// Get Department By Id
	@GetMapping("/departments/{id}")
	public Optional<Department> getDepartment(@PathVariable int id) {
		return departmentService.getDepartment(id);
		
	}
	
	// Update Department By id
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") int id, @RequestBody Department dept) {
		return departmentService.updateDepartment(id, dept);
		
	}
	
	// Delete Department by Id
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") int id) {
		return departmentService.deleteDepartmentById(id);
	}
	
}

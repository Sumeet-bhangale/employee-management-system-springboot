package com.EmpManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}

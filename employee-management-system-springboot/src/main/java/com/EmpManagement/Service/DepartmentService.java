package com.EmpManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmpManagement.Entity.Department;
import com.EmpManagement.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	
	// Add Department
	public void addDepartment(Department d) {
		departmentRepository.save(d);
	}

	
	// Get All Departments
	public List<Department> getAllDepartments() {
		List<Department> depts = (List<Department>) departmentRepository.findAll();
		return depts;
	}
}

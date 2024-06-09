package com.EmpManagement.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

	// Get Department By Id
	public Optional<Department> getDepartment(int id) {
		return departmentRepository.findById(id);

	}

	// Update Department Details
	public Department updateDepartment(int id, Department department) {
		Optional<Department> department1 = departmentRepository.findById(id);

		if (department1.isPresent()) {
			Department originalDepartment = department1.get();

			if (Objects.nonNull(department.getDepartment_name())
					&& !"".equalsIgnoreCase(department.getDepartment_name())) {
				originalDepartment.setDepartment_name(department.getDepartment_name());
			}
			if (Objects.nonNull(department.getShort_name()) && !"".equals(department.getShort_name())) {
				originalDepartment.setShort_name(department.getShort_name());
			}
			return departmentRepository.save(originalDepartment);
		}
		return null;
	}

	// Delete Department
	public String deleteDepartmentById(int id) {
		if (departmentRepository.findById(id).isPresent()) {
			departmentRepository.deleteById(id);
			return "Department deleted successfully";
		}
		return "No such Department in the database";
	}

}

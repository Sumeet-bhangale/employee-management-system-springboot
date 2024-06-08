package com.EmpManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmpManagement.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	

}

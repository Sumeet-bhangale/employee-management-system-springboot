package com.EmpManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int department_id;
	
	@Column(name = "short_name")
	private String short_name;
	
	@Column(name = "department_name")
	private String department_name;

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Department(int department_id, String short_name, String department_name) {
		super();
		this.department_id = department_id;
		this.short_name = short_name;
		this.department_name = department_name;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

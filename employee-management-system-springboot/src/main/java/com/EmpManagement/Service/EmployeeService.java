package com.EmpManagement.Service;

import com.EmpManagement.Entity.Employee;
import com.EmpManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    // Add Employees
    public void addEmployee(Employee emp) {
        employeeRepository.save(emp);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        return employees;
    }

    // Update Employee Details
    public Employee updateEmployeeById(int id, Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(id);

        if (employee1.isPresent()) {
            Employee originalEmployee = employee1.get();

            if (Objects.nonNull(employee.getEmployee_name()) && !"".equalsIgnoreCase(employee.getEmployee_name())) {
                originalEmployee.setEmployee_name(employee.getEmployee_name());
            }
            if (Objects.nonNull(employee.getSalary()) && employee.getSalary() != 0) {
                originalEmployee.setSalary(employee.getSalary());
            }
            return employeeRepository.save(originalEmployee);
        }
        return null;
    }


    //Delete Employee
    public String deleteEmployeeByID(int id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully";
        }
        return "No such employee in the database";
    }

}

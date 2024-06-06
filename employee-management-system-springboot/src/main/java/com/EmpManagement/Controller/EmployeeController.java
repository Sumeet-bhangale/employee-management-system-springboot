package com.EmpManagement.Controller;

import com.EmpManagement.Entity.Employee;
import com.EmpManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    // Get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }

    // Add Employee
    @PostMapping("/addEmployees")
    public void addEmployees(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
    }

    // Update Employee
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee emp) {

        return employeeService.updateEmployeeById(id, emp);
    }


    // Delete Employee
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        return employeeService.deleteEmployeeByID(id);
    }


}

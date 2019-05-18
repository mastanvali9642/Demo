package com.mastan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastan.entities.Employee;
import com.mastan.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(name="/getEmployee")
	public List<Employee> getEmployees(){
Sysout.out.println("hello mastan"):
	
		return employeeService.getEmployee();
	}
	

}

package com.mastan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastan.entities.Employee;
import com.mastan.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	
	}

}

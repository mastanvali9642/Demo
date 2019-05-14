package com.mastan.repo;

import org.springframework.data.repository.CrudRepository;

import com.mastan.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

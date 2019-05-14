package com.mastan;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mastan.entities.Employee;
import com.mastan.service.EmployeeService;

@SpringBootApplication
public class SpringBootEx10Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringBootEx10Application.class, args);
	
	
	EmployeeService employeeService=(EmployeeService)applicationContext.getBean("employeeService");
	
	
List<Employee> elist=employeeService.getEmployee();
for(Employee emp:elist) {
	System.out.println(emp.getName()+","+emp.getDesg());
}
	
		
	
	}

}

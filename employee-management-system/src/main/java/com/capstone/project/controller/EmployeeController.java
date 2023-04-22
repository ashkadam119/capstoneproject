package com.capstone.project.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeNotFound;
import com.capstone.project.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
	
	
	
	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
		
		
	}
	
	@GetMapping("/getById/{Id}")
	public Employee getById(@PathVariable long Id) throws EmployeeNotFound {
		
		log.info("An INFO Message");
		return service.getEmployeeById(Id);
	}
	
	
	
	
	
	

}

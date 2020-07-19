package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/getEmployeeList")
	public List<Employee> fetchEmployeeList()
	{
		List<Employee> employees=new ArrayList<Employee>();
		//fetch list from database
		employees = service.fetchEmployeeList();
		return employees;
	}
	
	
	@PostMapping("/addEmployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployeeToDB(employee);
	}
	
	
	@GetMapping("/getEmployeeById/{empId}")
	public Employee fetchEmployeeById(@PathVariable long empId)
	{
		return service.fetchEmployeeById(empId).get();
	}
	
	@DeleteMapping("/deleteEmployeeById/{empId}")
	public String deleteEmployeeById(@PathVariable long empId)
	{
		return service.deleteEmployeeById(empId);
	}
}

package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> fetchEmployeeList()
	{
		return repository.findAll();
	}
	
	public Employee saveEmployeeToDB(Employee employee)
	{
		return repository.save(employee);
	}
	
	public Optional<Employee> fetchEmployeeById(long empId)
	{
		return repository.findById(empId);
	}
	
	public String deleteEmployeeById(long empId)
	{
		String result;
		try 
		{
			repository.deleteById(empId);
			result = "employee deleted successfully";
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			result = "employee with id not deleted";
		}
		return result;
		
	}
	
}

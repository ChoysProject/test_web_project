package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeModel;

public interface EmployeeService {

	List<EmployeeModel> getAllEmployee();
	void insertEmployee(EmployeeModel employeeModel);
	void updateEmployee(EmployeeModel employeeModel);
	void deleteEmployee(EmployeeModel employeeModel);
}

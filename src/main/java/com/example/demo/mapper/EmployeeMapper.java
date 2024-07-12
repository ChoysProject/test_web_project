package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.EmployeeModel;

public interface EmployeeMapper {

	List<EmployeeModel> getAllEmployee();
	void insertEmployee(EmployeeModel employeeModel);
	void updateEmployee(EmployeeModel employeeModel);
	void deleteEmployee(EmployeeModel employeeModel);
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<EmployeeModel> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeMapper.getAllEmployee();
	}

	@Override
	public void insertEmployee(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		employeeMapper.insertEmployee(employeeModel);
	}

	@Override
	public void updateEmployee(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		employeeMapper.updateEmployee(employeeModel);
	}

	@Override
	public void deleteEmployee(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		employeeMapper.deleteEmployee(employeeModel);
	}

	
	
}

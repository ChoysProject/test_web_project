package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.config.SomeComponent;
import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {

	
    @Autowired
    private SomeComponent someComponent;

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/")
    public ModelAndView showIndexPage() {
        ModelAndView modelAndView = new ModelAndView("index");

        // DB 테스트 코드
        someComponent.doSomething();

        EmployeeModel employeeModel = new EmployeeModel();
        
        employeeModel.setEmp("홍길동");
//        employeeModel.setManager("조영상");
//        employeeModel.setEmpTel("7777");

        
//        employeeService.updateEmployee(employeeModel);
        
        // insert
//        employeeService.insertEmployee(employeeModel);

        employeeService.deleteEmployee(employeeModel);
        
        
        
        List<EmployeeModel> EmployeeModelList = new ArrayList<>();
        EmployeeModelList = employeeService.getAllEmployee();

        
        
        modelAndView.addObject(EmployeeModelList);
        
        return modelAndView;
    }
	
    @GetMapping("/test")
    public ModelAndView showTestPage() {
        ModelAndView modelAndView = new ModelAndView("test");
        return modelAndView;
    }
	
}

package com.olejarzikt.springboot.crudemployee.rest;

import com.olejarzikt.springboot.crudemployee.dao.EmployeeDAO;
import com.olejarzikt.springboot.crudemployee.entity.Employee;
import com.olejarzikt.springboot.crudemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService=theEmployeeService;
    }

    @GetMapping("/employess")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}

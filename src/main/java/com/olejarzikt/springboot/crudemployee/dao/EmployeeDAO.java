package com.olejarzikt.springboot.crudemployee.dao;

import com.olejarzikt.springboot.crudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}

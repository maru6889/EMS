package com.example.ems.repository;

import com.example.ems.domain.Employee;

public interface EmployeeRepository {
    //create
    void insertEmployee(Employee employee);
    //read
    Employee findEmployee(int empNo);

    //update
    void updateEmployee(Employee employee);

    //delete
    void deleteEmployee(int empNo);
}

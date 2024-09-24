package com.example.ems.repository;

import com.example.ems.domain.Salary;

import java.sql.Date;
import java.util.List;

public interface SalaryRepository {
    //create
    void insertSalary(Salary salary);

    //read
    List<Salary> findSalaries(int empNo, Date fromDate, Date toDate);

    //update
    void updateSalary(Salary salary);

    //delete
    void deleteSalary(int empNo, Date fromDate);
}

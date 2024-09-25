package com.example.ems.repository;

import com.example.ems.domain.Salary;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.util.List;

@Mapper
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

package com.example.ems.repository;

import com.example.ems.domain.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentRepository {
    //create
    void insertDepartment(Department department);

    //read
    Department findDepartment(int deptNo);

    //update
    void updateDepartment(int deptNo);

    //delete
    void deleteDepartment(int deptNo);

}

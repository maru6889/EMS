package com.example.ems.repository;

import com.example.ems.domain.DeptEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DeptEmpRepository {
    //create

    //read
    DeptEmp selectDeptEmpByEmpNo(int empNo);
    //update

    //delete

}

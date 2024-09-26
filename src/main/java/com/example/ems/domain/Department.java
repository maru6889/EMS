package com.example.ems.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Department {
    private String deptNo;
    private String deptName;
    private List<DeptEmp> deptEmps;
}

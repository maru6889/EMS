package com.example.ems.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Employee {
    private int empNo;
    private LocalDate date;
    private String firstName;
    private String lastName;
    private GenderType gender;
    private LocalDate hireDate;
    private List<DeptEmp> deptEmps;
}

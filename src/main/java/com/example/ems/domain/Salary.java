package com.example.ems.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class Salary {
    private int empNo;
    private int salary;
    private LocalDate fromDate;
    private LocalDate toDate;
}

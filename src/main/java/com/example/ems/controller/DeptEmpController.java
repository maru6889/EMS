package com.example.ems.controller;

import com.example.ems.repository.DeptEmpRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept-emp")
@RequiredArgsConstructor
@Slf4j
public class DeptEmpController {

    private final DeptEmpRepository deptEmpRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> findDeptEmpByEmpNo(@PathVariable("id") int empNo) {
        log.info("findDeptEmpByEmpNo 호출");
        return new ResponseEntity<>(deptEmpRepository.selectDeptEmpByEmpNo(empNo), HttpStatus.OK);
    }
}

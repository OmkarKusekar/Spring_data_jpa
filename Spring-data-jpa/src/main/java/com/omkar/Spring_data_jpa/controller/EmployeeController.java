package com.omkar.Spring_data_jpa.controller;

import com.omkar.Spring_data_jpa.Entity.Employee;
import com.omkar.Spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee>getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id).
                map(ResponseEntity::ok).
                orElseGet(()-> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteEmployee(@PathVariable Long id){

        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }


}

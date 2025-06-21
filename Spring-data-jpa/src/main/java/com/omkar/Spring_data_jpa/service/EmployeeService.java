package com.omkar.Spring_data_jpa.service;

import com.omkar.Spring_data_jpa.repository.EmployeeRepository;
import com.omkar.Spring_data_jpa.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // create or update employee

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }


}

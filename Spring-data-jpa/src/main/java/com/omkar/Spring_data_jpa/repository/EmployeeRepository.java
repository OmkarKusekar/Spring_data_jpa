package com.omkar.Spring_data_jpa.repository;

import com.omkar.Spring_data_jpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}

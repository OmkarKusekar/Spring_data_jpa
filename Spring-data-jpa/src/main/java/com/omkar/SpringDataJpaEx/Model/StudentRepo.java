package com.omkar.SpringDataJpaEx.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {


}

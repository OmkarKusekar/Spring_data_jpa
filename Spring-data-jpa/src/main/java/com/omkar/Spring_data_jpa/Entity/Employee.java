package com.omkar.Spring_data_jpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;



}

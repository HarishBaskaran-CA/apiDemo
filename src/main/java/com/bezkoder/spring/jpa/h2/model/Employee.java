package com.bezkoder.spring.jpa.h2.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String email;
    @Column
    private String phone;
}
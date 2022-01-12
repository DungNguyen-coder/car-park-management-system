package com.dungnguyen.carparkmanagementsystem.hrm_staff.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @Column(nullable = false, length = 10)
    private String sex;

    @Column(name = "address",nullable = false, length = 50)
    private String address;

    @Column(nullable = false, length = 10)
    private String phone;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 10)
    private String department;

    @Column(nullable = false, length = 50)
    private String account;

    @Column(nullable = false, length = 20)
    private String password;

}

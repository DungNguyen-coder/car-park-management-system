package com.dungnguyen.carparkmanagementsystem.hrm_staff.repository;

import com.dungnguyen.carparkmanagementsystem.hrm_staff.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    public Employee findByAccount(String account);
}

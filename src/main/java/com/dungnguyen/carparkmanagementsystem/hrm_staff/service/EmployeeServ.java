package com.dungnguyen.carparkmanagementsystem.hrm_staff.service;

import com.dungnguyen.carparkmanagementsystem.hrm_staff.entity.Employee;
import com.dungnguyen.carparkmanagementsystem.hrm_staff.exception.CantEditException;
import com.dungnguyen.carparkmanagementsystem.hrm_staff.repository.EmployeeRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
public class EmployeeServ {
    private EmployeeRepo employeeRepo;

    public EmployeeServ(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee addNewEmployee(Employee employee){
        Employee old = employeeRepo.findByAccount(employee.getAccount());

        if (old != null && old.getId() != employee.getId()){
            try {
                throw new CantEditException("Account already exists !");
            } catch (CantEditException e) {
                e.printStackTrace();
            }
            return null;
        }

        return employeeRepo.save(employee);
    }

    public Employee editEmployee(Employee employee){
        Employee old = employeeRepo.findByAccount(employee.getAccount());

        if (old != null && old.getId() != employee.getId()){
            try {
                throw new CantEditException("Account already exists !");
            } catch (CantEditException e) {
                e.printStackTrace();
            }
            return null;
        }

        return employeeRepo.save(employee);
    }

    public Employee getEmployeeById(Long id){
        return employeeRepo.findById(id).orElse(null);
    }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }
}

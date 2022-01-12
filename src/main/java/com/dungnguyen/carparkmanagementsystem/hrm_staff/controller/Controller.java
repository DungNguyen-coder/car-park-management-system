package com.dungnguyen.carparkmanagementsystem.hrm_staff.controller;

import com.dungnguyen.carparkmanagementsystem.hrm_staff.entity.Employee;
import com.dungnguyen.carparkmanagementsystem.hrm_staff.service.EmployeeServ;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class Controller {

    private final EmployeeServ employeeServ;

    public Controller(EmployeeServ employeeServ) {
        this.employeeServ = employeeServ;
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmployees(){
        return employeeServ.getAllEmployee();
    }

    @GetMapping("/get")
    public Employee getEmployeeById(@PathParam("id") Long id){
        return employeeServ.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee addNewEmployee(@RequestBody Employee employee){
        return employeeServ.addNewEmployee(employee);
    }

    @PutMapping("/edit")
    public Employee editEmployee(@RequestBody Employee employee){
        return employeeServ.editEmployee(employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployeeById(@PathParam("id") Long id){
        employeeServ.deleteEmployeeById(id);
    }

}

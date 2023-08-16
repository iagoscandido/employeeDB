package com.iagoscandido.restfulapi.controller;

import com.iagoscandido.restfulapi.model.Employee;
import com.iagoscandido.restfulapi.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping(" ")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById (@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public Employee saveEmployee (@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee (@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

}

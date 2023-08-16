package com.iagoscandido.restfulapi.repository;

import com.iagoscandido.restfulapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

package com.side.employ.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.side.employ.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

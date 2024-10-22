package com.example.javaguidesapi.repository;

import com.example.javaguidesapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //All the methods in a simple JpaRepository class are by default
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

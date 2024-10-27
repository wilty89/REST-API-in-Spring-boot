package com.wilber.Spring.Initializr.application.repository;

import com.wilber.Spring.Initializr.Domain.persistence.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}
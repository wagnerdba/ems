package com.wrtecnologia.ems.repository;

import com.wrtecnologia.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

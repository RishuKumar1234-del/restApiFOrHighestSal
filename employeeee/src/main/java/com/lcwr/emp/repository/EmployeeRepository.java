package com.lcwr.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.lcwr.emp.entity.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {


}

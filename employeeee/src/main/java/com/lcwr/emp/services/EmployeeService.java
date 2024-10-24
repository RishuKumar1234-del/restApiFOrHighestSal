package com.lcwr.emp.services;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

import com.lcwr.emp.entity.EmployeeModel;

public interface EmployeeService {
	
	public EmployeeModel addEmployee(EmployeeModel emp);
	public List<EmployeeModel> getAllEmployee();
	public EmployeeModel getEmployeeByEid(int id);
	public EmployeeModel updateEmployee(EmployeeModel emp);
	public String deleteEmployee(int id);
	public void findHighestPaidEmployeeFromEachDepartment();


}

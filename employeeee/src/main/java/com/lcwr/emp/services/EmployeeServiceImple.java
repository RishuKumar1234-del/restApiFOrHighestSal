package com.lcwr.emp.services;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwr.emp.entity.EmployeeModel;
import com.lcwr.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImple implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public EmployeeModel addEmployee(EmployeeModel emp) {
		EmployeeModel  addedEmp=empRepository.save(emp);
		return addedEmp ;
	}

	@Override
	public List<EmployeeModel> getAllEmployee() {
		List<EmployeeModel> empList=empRepository.findAll();
		return empList;
	}

	@Override
	public EmployeeModel getEmployeeByEid(int id) {
		
		return empRepository.findById(id).get();
	}

	@Override
	public EmployeeModel updateEmployee(EmployeeModel emp) {
		EmployeeModel em=null;
		List<EmployeeModel> list=empRepository.findAll();
		for(EmployeeModel empl:list) {
			if(empl.getEid()==emp.getEid()) {
				em=empl;
			}
			else {
				throw new RuntimeException("this employee is not found in this employee table");
			}
		}
		return null;
	}

	@Override
	public String deleteEmployee(int id) {
		empRepository.deleteById(id);
		return "the employee has been successfully removed";
	}

	@Override
	public void findHighestPaidEmployeeFromEachDepartment() {
		Comparator<EmployeeModel> empByHighSal=Comparator.comparing(EmployeeModel::getSalary);
		ConcurrentMap<String, Optional<EmployeeModel>> collect = empRepository.findAll().stream().collect(Collectors.groupingByConcurrent(EmployeeModel::getDepartment, 
				Collectors.reducing(BinaryOperator.maxBy(empByHighSal))));
		
		for(Map.Entry<String, Optional<EmployeeModel>> me:collect.entrySet()) {
			System.out.println(me.getKey() + " = " +me.getValue());
		}
		
	}

}

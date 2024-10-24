package com.lcwr.emp.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwr.emp.entity.EmployeeModel;
import com.lcwr.emp.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmp")
	public EmployeeModel addEmployee(@RequestBody EmployeeModel emp) {
		return employeeService.addEmployee(emp);
	}
	
	@GetMapping("/findAll")
	public List<EmployeeModel> findAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@GetMapping("/findAll/{id}")
	public EmployeeModel findEmployeeByEid(@PathVariable() int id) {
		
		return employeeService.getEmployeeByEid(id);
	}
	
	@PutMapping("/update")
	public EmployeeModel updateEmployee(@RequestBody EmployeeModel emp) {
		
		return employeeService.updateEmployee(emp);
	}
	@DeleteMapping("/findAll/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		return employeeService.deleteEmployee(id);
	}
	
	@GetMapping("/highsal")
	public void findHighestPaidEmployeeFromEachDepartment() {
		
		employeeService.findHighestPaidEmployeeFromEachDepartment();
	}
	
	

}

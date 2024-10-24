package com.lcwr.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lcwr.emp.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeeeApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeeeApplication.class, args);
		System.out.println("done!!");
		
		
}
}

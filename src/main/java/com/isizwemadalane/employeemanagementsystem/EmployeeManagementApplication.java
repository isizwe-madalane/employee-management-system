package com.isizwemadalane.employeemanagementsystem;

import com.isizwemadalane.employeemanagementsystem.model.Employee;
import com.isizwemadalane.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("Tony", "Stark", "tony@stark.com"));
		this.employeeRepository.save(new Employee("Lex", "Luthor", "lex@luthor.com"));
		this.employeeRepository.save(new Employee("Elon", "Musk", "elon@musk.com"));
		this.employeeRepository.save(new Employee("Isizwe", "Madalane", "isizwe@madalane.com"));
	}
}

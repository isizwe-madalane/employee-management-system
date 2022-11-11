package com.isizwemadalane.springbootreactjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.isizwemadalane.springbootreactjs.model.Employee;
import com.isizwemadalane.springbootreactjs.repository.EmployeeRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

     private final EmployeeRepository repository;

     @Autowired
     public DatabaseLoader(EmployeeRepository repository) {
         this.repository = repository;
     }

    @Override
    public void run(String... strings) throws Exception {
        // this.repository.save(new Employee("King", "Kong", "Solo jungle ruler"));
        this.repository.save(new Employee("King", "Kong", "Solo jungle ruler"));
    }
}

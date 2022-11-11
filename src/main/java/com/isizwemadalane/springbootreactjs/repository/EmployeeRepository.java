package com.isizwemadalane.springbootreactjs.repository;


import org.springframework.data.repository.CrudRepository;

import com.isizwemadalane.springbootreactjs.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

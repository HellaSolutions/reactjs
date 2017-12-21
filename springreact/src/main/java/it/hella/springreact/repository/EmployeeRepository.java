package it.hella.springreact.repository;

import org.springframework.data.repository.CrudRepository;

import it.hella.springreact.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

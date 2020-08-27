package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;

public interface EmployeeService {

	Collection<Employee> findAll();

	Optional<Employee> findById(int employeeId);

	void deleteById(int employeeId);

	void update(int employeeId, Employee employee);

	boolean saveEmployee(Employee employee);

}

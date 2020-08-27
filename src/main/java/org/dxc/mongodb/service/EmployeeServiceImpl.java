package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Collection<Employee> findAll() {
		// TODO Auto-generated method stub
		Collection<Employee> e = employeeRepository.findAll();
		return e;
	}

	
	  @Override public boolean saveEmployee(Employee employee) {
		  // TODO Auto-generated method stub return
	  boolean status = employeeRepository.save( employee) != null;
	  return status;
	  }
	 
	
	

	@Override
	public Optional<Employee> findById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeId);
	}

	@Override
	public void deleteById(int employeeId) {
		employeeRepository.deleteById(employeeId);

	}

	@Override
	public void update(int employeeId, Employee employee) {
		// TODO Auto-generated method stub
		
	}



	/*
	 * @Override public void update(int employeeId, Employee employee) {
	 * 
	 * Employee emp = employeeRepository.getOne(employeeId);
	 * 
	 * emp.setFirstname(employee.getFirstname());
	 * emp.setLastname(employee.getLastname());
	 * emp.setJobTitle(employee.getFirstname());
	 * emp.setSalary(employee.getSalary());
	 * 
	 * employeeRepository.save(emp);
	 * 
	 * 
	 * }
	 */

}

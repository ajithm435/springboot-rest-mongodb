package org.dxc.mongodb.controller;

import java.util.Collection;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/getall")

	public Collection<Employee> getAllEmployee() {

		return employeeService.findAll();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public HttpStatus insertEmployee(@RequestBody Employee employee) {
		boolean status = employeeService.saveEmployee(employee);
		return status ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	

	@RequestMapping("/getbyid")
	public Optional<Employee> getEmployeeById(int employeeId) {

		Optional<Employee> result = employeeService.findById(employeeId);

		return result;
	}

	@RequestMapping("/delete")
	public void deleteById(int employeeId) {

		employeeService.deleteById(employeeId);

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateEmployee(@RequestBody int employeeId, Employee employee) {

		employeeService.update(employeeId, employee);

	}

}

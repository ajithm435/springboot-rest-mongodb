package org.dxc.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Document(collection="employee")
public class Employee {

	@Id
	private int employeeId;
	private String firstname;
	private String lastname;
	private String jobTitle;
	private double salary;

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", jobtitle=" + jobTitle + ", salary=" + salary + "]";
	}
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int employeeId, String firstname, String lastname, String jobTitle, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}



	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}

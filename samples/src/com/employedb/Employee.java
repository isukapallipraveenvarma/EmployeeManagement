package com.employedb;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private String id;

	private String name;

	private Double salary;

	private String designation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId().compareTo(o.getId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) o;

		return this.id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	public Employee(String id, String name, String designation, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	static class ComparatorId implements Comparator<Employee> {

		public int compare(Employee obj1, Employee obj2) {

			return obj1.id.compareTo(obj2.id);
		}
	}

	

}

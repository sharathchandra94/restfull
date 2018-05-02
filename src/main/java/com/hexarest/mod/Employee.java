package com.hexarest.mod;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee implements Serializable {
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public Employee(Integer id, String name, String dept, Integer salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}

}

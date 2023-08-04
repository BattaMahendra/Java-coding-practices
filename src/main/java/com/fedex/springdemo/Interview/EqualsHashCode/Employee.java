package com.fedex.springdemo.Interview.EqualsHashCode;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		System.out.println(Objects.hash(id));
		return Objects.hash(id);
	}
	public Employee(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null ||getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return name.length()==other.name.length();
		//return id == other.id && Objects.equals(name, other.name);
	}
}

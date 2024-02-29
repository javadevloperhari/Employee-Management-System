package com.empapp;

public class Employee {
	
	private int id;
	private String name;
	private double salery;
	private int age;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salery, int age) {
		this.id = id;
		this.name = name;
		this.salery = salery;
		this.age = age;
	}
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
	public double getSalery() {
		return salery;
	}
	public void setSalery(double salery) {
		this.salery = salery;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salery=" + salery + ", age=" + age + "]";
	}
	
	

}

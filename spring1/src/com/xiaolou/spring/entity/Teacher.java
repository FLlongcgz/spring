package com.xiaolou.spring.entity;

public class Teacher {

	private String name ;
	private int age ;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
	
}

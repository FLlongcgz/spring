package com.xiaolou.spring.entity;

public class Course {

	
	private String cname;  // 课程名
	private String hours;  // 课时
	private Teacher teacher ; // 授课老师
	
	
	public Course() {
		super();
	}
	public Course(String cname, String hours, Teacher teacher) {
		super();
		this.cname = cname;
		this.hours = hours;
		this.teacher = teacher;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void show() {
		
		System.out.println(this.cname+"-"+ this.hours + "--"+ this.teacher.getName());
	}
}

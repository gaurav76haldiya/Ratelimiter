package com.gaurav.Demo.copy2;

import java.util.ArrayList;
import java.util.List;

public class UserEx {
    private int age;
    private String name;
    private String gender;
	public int getAge() {
		return age;
	}
	public static List<UserEx> list=new ArrayList<>();
	public UserEx( String name, String gender,int age) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;

	}
	
	public UserEx() {
		// TODO Auto-generated constructor stub
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserEx [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
    
}

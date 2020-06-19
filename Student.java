package ioc;

import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private String gender;
	private int age;
	
	private Computer computer;
	private Phone phone;
	
	public Student() {
		System.out.println("执行 Student() 构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		System.out.println("  set注入Computer对象：" + computer);
		this.computer = computer;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		System.out.println("  set注入PHone对象：" + phone);
		this.phone = phone;
	}
	
	
}








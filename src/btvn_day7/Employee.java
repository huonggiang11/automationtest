package btvn_day7;

import java.util.Scanner;

public class Employee {
	private String name, email;
	private int ID, age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Scanner sc = new Scanner(System.in);
	public void inputData() {
		System.out.print("Enter name:");
		name = sc.nextLine();
		System.out.print("Enter email:");
		email = sc.nextLine();
		System.out.print("Enter ID:");
		ID = sc.nextInt();
		System.out.print("Enter age:");
		age = sc.nextInt();
	}
	@Override
		public String toString() {
			return "Name: "+ getName() + ", email:" + getEmail() + ", ID: " + getID() + ", age: "+ getAge();
}
		
}

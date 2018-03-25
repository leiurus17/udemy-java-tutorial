package com.kamotelabs.tutorial17;

class Frog {
	String name;
	int age;
	
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
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class App {
	
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		frog1.setName("Bertie");
		frog1.setAge(7);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		Frog frog2 = new Frog();
		
		frog2.setInfo("Bane", 3);
		
		System.out.println(frog2.getName());
		System.out.println(frog2.getAge());
	}

}

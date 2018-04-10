package com.kamotelabs.tutorial42;

class Person {
	private int id;
	private String name;
	
    public Person(int id, String name) {
    	this.id = id;
    	this.name = name;
    }

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		System.out.println(person1.equals(person2));

	}

}

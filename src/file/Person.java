package file;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
	private int age;
	private String sex;
	
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String toString() {
		return name+age+sex;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.syntax.class13;

public class MethodsDemo2 {
	
	//create a method that takes an animal name and person name if name is equal to 
	//to Tyfur and animal is Horse print camel otherwise print horse. 
	
	void TeyfurAndHorse(String personName, String animalName) {
		if ("Teyfur".equals(personName)&& "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a camel");
		}else {
			System.out.println("This is a Horse");
		}

	}
	public static void main(String[] args) {
		MethodsDemo2 obj=new MethodsDemo2();
		obj.TeyfurAndHorse("Teyfur", "Horse");
		obj.TeyfurAndHorse("Tarik", "Horse");

	}

}

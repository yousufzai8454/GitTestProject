package com.syntax.class14;

public class Task1 {

	//Create a method that will take 2 parameters as a numbers and prints * which number is larger.
	
	void printLarger(int num1, int num2) {
		if(num1>num2) {
			System.out.println("Number i is greater");
		}else if (num2>num1) {
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("numbers are the same. ");
		}
	}
	
public static void main(String[] args) {
	
	Task1 obj=new Task1();
	obj.printLarger(10, 12);
	obj.printLarger(12, 10);
	obj.printLarger(10, 10);
}

}

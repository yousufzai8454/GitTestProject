package com.syntax.class10;

public class TaskInClass {

	public static void main(String[] args) {
		// create an array and retrieve all elements in reverse order. 

		int []arr = {10,20,30,40,50,60,};
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		
		
		for (int i=arr.length-1; i>=0; i--) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------another way----------");
		
		
		
		int[] arrs = { 45,23,15,30};
		
		for (int i = 0; i <arrs.length; i++) {
			System.out.println(arrs[arrs.length - i -1]+ " ");
		}
	}
	

}

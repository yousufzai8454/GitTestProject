package com.syntax.class05;

import java.util.Scanner;

public class ClassFiveHomeWorkOne {

	public static void main(String[] args) {
		/*
		 * 
		 * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
			short (under 60 inch)
			medium(between 60 -72 inch)
			tall (over 72 inch)
			
		
		 * 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your hight");
	
		int hight=input.nextInt();
		
		if(hight < 60) {
			System.out.println("You are shot");
		}else if(hight >= 60 && hight <= 72) {
			System.out.println("You are medium");
		}else {
			System.out.println("You are tall");
			
		}

	}

}

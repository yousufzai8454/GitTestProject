package com.syntax.class10;

public class HomeWorkClass09 {
		public static void main(String[] args) {
			
			
			//Create an array on integers and calculate the sum of all elements in an array
			
			
			int[]numbers = {15, 45, 10, 32, };
			
			int size = numbers.length;
			
			int sum =0;
			
			for (int i =0 ; i < size; i++) {
							
				sum+= numbers[i];
				
				System.out.println("Sume of all elements in the array = "+ sum);
							
			}
	
	
			sum=0;
			
			for (int num:numbers) {
				
				sum+=num;
				
			}
}
}

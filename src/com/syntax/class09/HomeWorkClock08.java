package com.syntax.class09;

public class HomeWorkClock08 {

	public static void main(String[] args) {
		// HomeWork clock.
		
		System.out.println("---------------Clock-----------------");
		
		String time;
		
		for (int h=0; h<24; h++) {
			
			for (int m=0; m<=59; m++) {
				
				if (h<10 && m<10) {
					time="0"+h+":"+"0"+m;
														
				}else if(h<10 && m>10) {
					time="0"+h+":"+m;
					
				}else if(h>10 && m<10) {
					time=h+":"+"0"+m;
				
					
				}else {
					time=h+":"+m;
					
				}
				System.out.println(time);
			
				
				}
		}
		
		

	}

}

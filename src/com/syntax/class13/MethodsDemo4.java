package com.syntax.class13;

public class MethodsDemo4 {

	// Create a method that takes boolean isSaleOn double price double discount. 
	// if isSaleOn=true return discount otherwise return original price. 
	double checkDiscount (boolean isSaleOn, double originalPrice, double discount) {
		if(isSaleOn) {
			
			return (originalPrice - originalPrice*discount);
			
		}else {
			
			return originalPrice;
		}
	}
		
	public static void main(String[] args) {
		
		MethodsDemo4 obj=new MethodsDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));
		
	}

}

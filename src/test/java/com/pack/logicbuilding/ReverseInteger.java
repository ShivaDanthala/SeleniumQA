package com.pack.logicbuilding;

public class ReverseInteger {

	public static void main(String[] args) {

		int number=87654321;
		int lastDigit;
		int reverseNumber=0;
		
//		System.out.println(Integer.MAX_VALUE); // when it crosses the integer range
		
		while(number!=0) {
			
		System.out.println("number is "+number);
		lastDigit=number%10;
		
		System.out.println("lastDigit "+lastDigit);
		reverseNumber=reverseNumber*10+lastDigit;
		
		System.out.println("reverseNumber "+reverseNumber);
		number=number/10;
		System.out.println();
		}	 	
//		System.out.println(reverseNumber);
	}

}

package com.pack.logicbuilding;

public class SwapTwo_Bitwise {

	public static void main(String[] args) {

		int a=20;
		int b=10;

		System.out.println("Before Swapping -----> a= "+a+" b =" +b);

		a=a^b;
		System.out.println(a);
		b=a^b;
		System.out.println(b);
		a=a^b;
		System.out.println(a);

		System.out.println("After Swapping -----> a= "+a+" b =" +b);
	}

}

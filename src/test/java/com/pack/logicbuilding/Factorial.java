package com.pack.logicbuilding;

public class Factorial {

	public static void main(String[] args) {

		int num=5;
		int result=1;
		for(int i=1; i<=num; i++) {
			result=result*i;
//			System.out.println(result);
		}
		System.out.println(result);
	}

}

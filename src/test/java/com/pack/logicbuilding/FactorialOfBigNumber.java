package com.pack.logicbuilding;

import java.math.BigInteger;

public class FactorialOfBigNumber {

	public static void main(String[] args) {

		int num=19;
		BigInteger result=BigInteger.ONE;
		for(int i=1; i<=num; i++) {
			result=result.multiply(BigInteger.valueOf(i));
//			System.out.println(result);
		}
		System.out.println(result);
	}

}

package com.pack.logicbuilding;

public class CountOfLastWord2 {

	public static void main(String[] args) {

		String s="    This is Progamming    ";
		String s1=s.trim();
		
		String wordsArr[]=s1.split(" ");

		int count;
		
		for(int i=wordsArr.length-1;i>=0;) {
			count=wordsArr[i].length();
			System.out.println(count);
			break;
		}
	}

}

package com.pack.logicbuilding;

public class CountOfLastWord {

	public static void main(String[] args) {

		String s="    This is Progamming    ";
		String s1=s.trim();

		char inputAr[]=s1.toCharArray(); // Even we can do this without using array
										//conversion using s1.length() 
										//and s1.charAt(i) method

		int count=0;

		for(int i=inputAr.length-1; i>=0; i--) {  
  // OR for(int i=s1.length()-1; i>=0; i--) {
			
			if(inputAr[i]!=' ') { 
	 //  OR if(s1.charAt(i)!=' '){
				count=count+1;
			}
			else {
				if(count>0) {
					System.out.println(count);
					break;
				}
			}
		}
	}

}

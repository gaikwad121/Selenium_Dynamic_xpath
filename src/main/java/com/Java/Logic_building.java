package com.Java;

	public class Logic_building {
	    public static void main(String[] args) {
	    	pattern1();
	    	pattern2();
	    	pattern3();
	    	pattern4();
	    	pattern5();
	    
	    }
	    /*
	     
1
22
333
4444
55555

	     */
	    static void pattern1() {
	    	int num=5;
	    	for(int i=1;i<=num;i++) {
	    		for(int j=1;j<=i;j++) {
	    			System.out.print(i);
	    		}
	    		System.out.println();
	    	}
	    }
	    /*
	     
A
AB
ABC
ABCD
ABCDE

	     */
	    static void pattern2() {
	    	int num=5;
	    	for(int i=1;i<=num;i++) {
		    	char ch='A';
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(ch);
	    		ch++;
	    	}
	    	System.out.println();
	    	}
	    }
	    /*
	    ABCDE
	    ABCD
	    ABC
	    AB
	    A/*
	       
	        
	       */
static void pattern3() {
	int num=5;
	for(int i=num;i>=1;i--) {
		char ch='A';
	for(int j=1;j<=i;j++) {
		System.out.print(ch);
		ch++;
	}
	System.out.println();
	}
}
/*
 
a
bb
ccc
dddd
eeeee
 */
static void pattern4() {
	int num=5;
	char ch='a';
	for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(ch);
	}
	ch++;
	System.out.println();
	}
}
static void pattern5() {
	int num=5;
	for(int i=1;i<=num;i++) {
	for(int j=1;j<=num-i;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
	}
}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
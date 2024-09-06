package com.tns.day3;

public class Constructor {
	
	int a= 10;
	int b= 20;
	
	Constructor() {
		System.out.println("Default Constructor");
	}
	
	Constructor(int a,int b) {
		int c=a+b;
		System.out.println("Paramatarized Constructor");
		System.out.println("A and B Add the value "+c);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10,1501);
		
		

	}

}

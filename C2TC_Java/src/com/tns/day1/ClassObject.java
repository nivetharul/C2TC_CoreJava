package com.tns.day1;

public class ClassObject {
	
	
	void add(int a,int b) {
		int c = a+b;
		System.out.println("Add the two value "+c);
	}
	
	void sub(int a,int b,int c ) {
		int d = a-b-c;
		System.out.println("Sub the three value "+d);
	}

	public static void main(String[] args) {
		ClassObject co = new ClassObject();
		co.add(10, 20);
		co.sub(25, 5, 10);
		

	}

}

package com.tns.day1;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println("Operator");
		System.out.println("Arithmetic :");
		int d=a+b;
		System.out.println("Addition "+d);
		int e=a-b;
		System.out.println("Subraction "+e);
		int f=a*b;
		System.out.println("Multiplication "+f);
		int g=a/b;
		System.out.println("Division "+g);
		System.out.println("Logical :");
		boolean h = true;
	    boolean i = false;
	    boolean j = h && i;
	    System.out.println("AND " + j); 
	    boolean k = h || i;
	    System.out.println("OR " +k);
	    boolean l = !h;
	    System.out.println("NOT "+l);
	    int inc=a++;
	    System.out.println("Increment "+inc);
		int inc1=++a;
		System.out.println("Increment "+inc1);
		int dec=a--;
		System.out.println("Decrement "+dec);
		int dec1=--a;
		System.out.println("Decrement "+dec1);




	}

}

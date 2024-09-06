package com.tns.day4;

public class Inheritance {
	class Parent{
		int num = 10;
		String name = "Priiya";
		
	}
	
	class Child extends Parent{
		int age = 25;
	}
	
	class Son extends Parent{
		
	}
	
	public static void main(String[] args) {
		Inheritance in = new Inheritance();
		
		Parent p = in.new Parent();
		Child c = in.new Child();
		Son s = in.new Son();
		
		System.out.println("Grand Parent class");
		System.out.println(p.num);
		System.out.println(p.name);
		System.out.println("Parent  Class");
		System.out.println(c.num);
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println("Child class");
		System.out.println(s.num);
		System.out.println(s.name);
	}



}

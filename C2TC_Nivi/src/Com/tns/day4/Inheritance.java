package Com.tns.day4;

public class Inheritance {
	
	
	
	class Parent{
		int a=10;
		String name = "Papu";
	}
	
	class child extends Parent{
		int age = 20;
		
	}
	
	class son extends Parent{
		
		
	}

	public static void main(String[] args) {
		Inheritance in = new Inheritance();
		
		 Parent p = in.new Parent();
		 child c = in.new child();
		 son s = in.new son();
		 
		 System.out.println("parent class");
		 System.out.println(p.a);
		 System.out.println(p.name);
		 System.out.println("Child class");
		 System.out.println(c.a);
		 System.out.println(c.name);
		 System.out.println(c.age);
		 System.out.println("Child class");
		 System.out.println(s.a);
		 System.out.println(s.name);
		
		

	}

}

package com.tns.day1;

public class Datatype {
    int a = 10;
    String name = "Data";
    boolean b = true;
    char c = 'N';
    float d = 20.5f;
    double e = 223471469.45363;

    public static void main(String[] args) {
        Datatype dt = new Datatype();
        
        // Printing values with their respective datatypes
        System.out.println("Value of a (int): " + dt.a);
        System.out.println("Value of name (String): " + dt.name);
        System.out.println("Value of b (boolean): " + dt.b);
        System.out.println("Value of c (char): " + dt.c);
        System.out.println("Value of d (float): " + dt.d);
        System.out.println("Value of e (double): " + dt.e);
    }
}

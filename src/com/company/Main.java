package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle t1 = new Triangle(3,3,3);
        Triangle t2 = new Triangle(3,3,1);
        Triangle t3 = new Triangle(3,2,1);
        Triangle t4 = new Triangle(2,2,1);

        System.out.println(t1.getType());
        System.out.println(t2.getType());
        System.out.println(t3.getType());
        System.out.println(t4.getType());

    }
}

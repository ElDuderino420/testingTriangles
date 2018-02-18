package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println(new Triangle(1,2,2).getType());
        System.out.println(new Triangle(2,1,2).getType());
        System.out.println(new Triangle(2,2,1).getType());
        System.out.println(new Triangle(2,2,2).getType());
        System.out.println(new Triangle(1,1,1).getType());
        //System.out.println(new Triangle("a",2,1).getType());
        System.out.println(new Triangle(4,5,6).getType());
        System.out.println(new Triangle(6,4,5).getType());
        System.out.println(new Triangle(5,6,4).getType());
        System.out.println(new Triangle(1,2,3).getType());
        System.out.println(new Triangle(0,0,0).getType());
        System.out.println(new Triangle(-10,1,2).getType());
        System.out.println(new Triangle(1,-1,2).getType());


    }
}

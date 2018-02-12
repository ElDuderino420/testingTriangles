package com.company;

public class Triangle {

    private double a, b, c;
    private String type;


    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType(){
        if(this.a <= 0 || this.b <= 0 || this.c <= 0){
            return "invalid input: negative numbers";
        } else if(Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c)) {
            return "invalid input";
        } else if(this.a == this.b && this.b == this.c){
            return "equilateral triangle";
        } else if(this.a == this.b || this.a == this.c || this.b == this.c){
            return "isosceles triangle";
        } else if(this.a != this.b && this.b != this.c){
            return "scalene triangle";
        } else {
            return "triangle";
        }

    }
}

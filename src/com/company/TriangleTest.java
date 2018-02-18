package com.company;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testTriangleIsosceles() {
        Triangle t = new Triangle(1,2,2);
        Assert.assertEquals(Triangle.TriangleType.ISOSCELES, t.getType());
    }

    @Test
    public void testTriangleEquilateral() {
        Triangle t =  new Triangle(2,2,2);
        Assert.assertEquals(Triangle.TriangleType.EQUILATERAL, t.getType());
    }

    @Test
    public void testTriangleScalene() {
        Triangle t = new Triangle(4,5,6);
        Assert.assertEquals(Triangle.TriangleType.SCALENE, t.getType());
    }

    @Test
    public void testTriangleInvalid() {
        Triangle t = new Triangle(1,2,3);
        Assert.assertEquals(Triangle.TriangleType.INVALID, t.getType());
    }

}
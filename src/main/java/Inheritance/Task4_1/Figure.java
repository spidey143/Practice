package Inheritance.Task4_1;

import java.util.ArrayList;
import java.util.List;

public class Figure {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylyinder = new Cylinder(2.0, 2.0);
        Pyramid pyramid = new Pyramid(100.0, 100.0);

        BoxTwo box = new BoxTwo(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylyinder)); // ok
        System.out.println(box.add(pyramid)); // failed
    }
}

abstract class Shape {
    private Double volume;

    public abstract Double getVolume();
}

abstract class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Pyramid extends Shape {
    private Double s;
    private Double h;

    public Pyramid(Double s, Double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public Double getVolume() {
        return s * h * 1 / 3;
    }
}

class Cylinder extends SolidOfRevolution {
    private Double height;

    public Cylinder(Double radius, Double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(getRadius(), 3) * 4 / 3;
    }
}

class BoxTwo extends Shape {
    private List<Shape> shapes = new ArrayList<>();
    private double available;

    public BoxTwo(double available) {
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Double getVolume() {
        return null;
    }
}
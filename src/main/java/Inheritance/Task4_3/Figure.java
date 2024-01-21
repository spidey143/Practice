package Inheritance.Task4_3;

import java.util.ArrayList;

public class Figure{
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2.0, 2.0);
        Pyramid pyramid = new Pyramid(100.0, 100.0);

        Box box = new Box(1000.0);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylinder)); // ok
        System.out.println(box.add(pyramid)); // failed
    }
}

interface Shape extends Comparable<Shape> {
    Double getVolume();

    @Override
    default int compareTo(Shape other) {
        return Double.compare(getVolume(), other.getVolume());
    }
}

abstract class SolidOfRevolution implements Shape {
    protected Double radius;

    public SolidOfRevolution(Double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Ball extends SolidOfRevolution { // конкретный класс

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }

    public Ball(Double radius) {
        super(radius);
    }
}

class Cylinder extends SolidOfRevolution { // конкретный класс

    private Double height;

    public Cylinder(Double radius, Double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public Double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Pyramid implements Shape {
    private Double height;
    private Double s; // площадь основания

    public Pyramid(Double height, Double s) {
        this.height = height;
        this.s = s;
    }

    @Override
    public Double getVolume() {
        return height * s * 4 / 3;
    }
}


class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private Double available;
    private Double volume;

    public Box(Double available) {
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
        return volume;
    }
}
package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Task4_0 {
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

class Shape {
    private Double volume;

    public Shape(Double volume) {
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    private Double radius;

    public SolidOfRevolution(Double volume, Double radius) {
        super(volume);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }
}

class Pyramid extends Shape {
    private Double s;
    private Double h;

    public Pyramid(Double s, Double h) {
        super(s * h * 1 / 3);
        this.s = s;
        this.h = h;
    }
}

class Cylinder extends SolidOfRevolution {
    private Double height;

    public Cylinder(Double radius, Double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }
}

class Ball extends SolidOfRevolution {

    public Ball(Double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}

class Box extends Shape {
    private List<Shape> shapes = new ArrayList<>();
    private Double available;

    public Box(Double available) {
        super(available);
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


}
package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
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

class Box extends Shape{
    private List<Shape> shapes = new ArrayList<>();
    private Double available;

    public Box(Double available) {
        super(available);
        this.available = available;
    }


}
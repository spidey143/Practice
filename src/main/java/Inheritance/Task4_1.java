package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Task4_1 {
    public static void main(String[] args) {
        BallTwo ball = new BallTwo(4.5);
        CylinderTwo cylyinder = new CylinderTwo(2.0, 2.0);
        PyramidTwo pyramid = new PyramidTwo(100.0, 100.0);

        BoxTwo box = new BoxTwo(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylyinder)); // ok
        System.out.println(box.add(pyramid)); // failed
    }
}

abstract class ShapeAbs {
    private Double volume;

    public abstract Double getVolume();
}

abstract class SolidOfRevolutionAbs extends ShapeAbs {
    private double radius;

    public SolidOfRevolutionAbs(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class PyramidTwo extends ShapeAbs {
    private Double s;
    private Double h;

    public PyramidTwo(Double s, Double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public Double getVolume() {
        return s * h * 1 / 3;
    }
}

class CylinderTwo extends SolidOfRevolutionAbs {
    private Double height;

    public CylinderTwo(Double radius, Double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}

class BallTwo extends SolidOfRevolutionAbs {
    public BallTwo(double radius) {
        super(radius);
    }

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(getRadius(), 3) * 4 / 3;
    }
}

class BoxTwo extends ShapeAbs {
    private List<ShapeAbs> shapes = new ArrayList<>();
    private double available;

    public BoxTwo(double available) {
        this.available = available;
    }

    public boolean add(ShapeAbs shape) {
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
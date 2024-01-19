package BasesOOP;

import java.util.Arrays;
import java.util.Random;

public class Task2_1 {
    public static void main(String[] args) {
        Vector v = new Vector(1.0,2.,3.0);
        Vector v2 = new Vector(2.2,4.0,5.0);
        System.out.println(v.sumVector(v2));
        System.out.println(Arrays.toString(Vector.gerRandomVectors(5)));
    }
}

class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getLength() {
        return Math.sqrt(
                Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)
        );
    }

    public Double scalarProduct(Vector otherVector) {
        return  this.x * otherVector.x +
                this.y * otherVector.y +
                this.z * otherVector.z;
    }

    public Vector vectorProduct(Vector otherVector) {
        return new Vector(
                this.y * otherVector.z - this.z * otherVector.y,
                this.z * otherVector.x - this.x * otherVector.z,
                this.x * otherVector.y - this.y * otherVector.x
        );
    }

    public Double angleBetweenVectors(Vector otherVector){
        return  scalarProduct(otherVector) /
                Math.abs(this.getLength()) * Math.abs(otherVector.getLength());
    }


    public Vector sumVector(Vector otherVector){
        return new Vector(
                this.x + otherVector.x,
                this.y + otherVector.y,
                this.z + otherVector.z
        );
    }


    public Vector diffVector(Vector otherVector){
        return new Vector(
                this.x - otherVector.x,
                this.y - otherVector.y,
                this.z - otherVector.z
        );
    }

    public static Vector[] gerRandomVectors(Integer N){
        Vector[] vectors = new Vector[N];
        Random rand = new Random();
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(
                    rand.nextDouble(),
                    rand.nextDouble(),
                    rand.nextDouble()
            );
        }
        return vectors;
    }

    public String toString() {
        return "("+ x + "," + y + "," + z + ")";
    }
}

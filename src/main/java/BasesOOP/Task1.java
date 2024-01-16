package BasesOOP;

public class Task1 {
}

class Vector{
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

    public Double getLength(){
        return Math.sqrt(
                Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2)
        );
    }

    public Double scalarProduct(Vector otherVector){
        return  this.x * otherVector.x +
                this.y * otherVector.y +
                this.z * otherVector.z;
    }

    public Double vectorProduct(Vector otherVector){
        return 0.2;
    }
}

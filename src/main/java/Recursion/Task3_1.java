package Recursion;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println(Equations.solveEquation(0,10));
    }
}

class Equations{
    public static Double func(double x){
        return Math.cos(Math.pow(x,5)) + Math.pow(x,4) - 345.3 * x - 23;
    }

    public static Double solveEquation(double start, double end){
        if(end - start <= 0.001){
            return start;
        }
        double x = start + (end - start) / 2;
        if (func(start) * func(x) > 0) return solveEquation(x, end);
        else return solveEquation(start, x);
    }
}

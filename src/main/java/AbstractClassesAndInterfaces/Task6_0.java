package AbstractClassesAndInterfaces;

public class Task6_0 {
    public static void main(String[] args) {
        double temperature = 40;
        System.out.println("t = " +
                new Celsius().convert(temperature));
        System.out.println("t = " +
                new Kelvin().convert(temperature));
        System.out.println("t = " +
                new Fahrenheit().convert(temperature));
    }
}

interface Converter{
    default Double convert(Double value){
        return null;
    };
}

class Celsius implements Converter{
    @Override
    public Double convert(Double value) {
        return value;
    }
}

class Kelvin implements Converter{
    @Override
    public Double convert(Double value){
        return value + 237.15;
    }
}

class Fahrenheit implements Converter{
    @Override
    public Double convert(Double value){
        return (value * 9.5) + 32;
    }
}

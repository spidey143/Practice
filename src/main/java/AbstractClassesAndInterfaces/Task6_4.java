package AbstractClassesAndInterfaces;
import java.util.Arrays;
import java.util.function.Function;

public class Task6_4 {
    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        System.out.println(Arrays.toString(fill(squares, integer -> integer * integer)));
    }

    public static <T> T[] fill(T[] array, Function<Integer, T> function){
        for (int i = 0; i < array.length; i++) {
            array[i] = function.apply(i);
        }
        return array;
    }
}

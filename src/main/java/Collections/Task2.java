package Collections;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> sasd = new ArrayList<>();
        sasd.add(1);
        sasd.add(2);
        sasd.add(3);
        sasd.add(2);
        List<String> sasd1 = new ArrayList<>();
        sasd1.add("1");
        sasd1.add("11");
        sasd1.add("111");
        sasd1.add("1");
        System.out.println(collectionNoDuplicate(sasd));
        System.out.println(collectionNoDuplicate(sasd1));
    }

    public static  <X> Collection<X> collectionNoDuplicate(Collection<X> collection){
        return new HashSet<>(collection);
    }
}

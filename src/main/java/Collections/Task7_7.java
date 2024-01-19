package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task7_7 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,4,5,5,5};
        System.out.println(countElements(array));
    }

    public static <K> Map<K, Integer> countElements(K[] array){
        Map<K, Integer> map = new HashMap<>();
        for (K el: array){
            map.put(el, map.getOrDefault(el,0) + 1);
        }
        return map;
    }
}

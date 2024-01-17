package Collections;

import java.util.*;

public class Task7_8 {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);
        originalMap.put("three", 1);

        Map<Integer, Collection<String>> swappedMap = swapKeysAndValues(originalMap);
        System.out.println(swappedMap);
    }

    public static <K,V> Map<V, Collection<K>> swapKeysAndValues(Map<K,V extends Collection<>> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();
        Collection<V> arrayList = new ArrayList<>();
        for(Map.Entry<K,V> it: map.entrySet()){
            V value = it.getValue();
            Collection<K> keys = map.getOrDefault(value, arrayList);
            keys.add(it.getKey());
            resultMap.put(value, keys);

        }
        return resultMap;
    }
}

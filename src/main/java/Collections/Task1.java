package Collections;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        frequencyDictionary("Пример текста для анализа частоты частоты слов слов слов слов слов");
    }
    public static void frequencyDictionary(String string){
        Map<String, Integer> map = new HashMap<>();

        for (String s: string.toLowerCase().split(" ")){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}

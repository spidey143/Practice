package Strings;

import java.util.HashMap;
import java.util.Map;

public class Task5_0 {
    public static void main(String[] args) {
        frequencyDictionary("Пример текста для анализа частоты букв");
    }
    public static void frequencyDictionary(String string){
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: string.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}

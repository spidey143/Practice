import java.util.*;

public class Strings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        System.out.println(findLargestString(strings));
        System.out.println(isPalindrome("AcBcA"));
        System.out.println(deleteNavalny("Навальный бяка фу Навальный бляка э"));
        System.out.println(countSubstring("abcabcabc", "abc"));
        frequencyDictionary("Пример текста для анализа частоты букв");

    }
    public static String findLargestString(List<String> strings) {
        int maxLength = 0;
        String largestString = "";
        for (String str : strings) {
            if(str.length() > maxLength){
                largestString = str;
                maxLength = str.length();
            }
        }
        return largestString + " " + maxLength + " " + strings.indexOf(largestString);
    }

    public static Boolean isPalindrome(String string) {
        string = string.toLowerCase().replaceAll(" ", "");
        StringBuilder word = new StringBuilder(string).reverse();
        if(string.contentEquals(word)) {
            return Boolean.TRUE;
        }
        else return Boolean.FALSE;
    }

    public static String deleteNavalny(String string){
        return string.replace("Навальный бяка", "[вырезано цензурой]");
    }

    public static Integer countSubstring(String string, String otherString){
        return (string.length() - string.replace(otherString, "").length()) / otherString.length();
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

package Strings;

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
}

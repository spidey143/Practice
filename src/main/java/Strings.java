import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Strings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        System.out.println(findLargestString(strings));

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
}

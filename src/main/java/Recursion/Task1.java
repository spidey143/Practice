package Recursion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        System.out.println(elementIsIncluded(nums, 10));
        System.out.println(binarySearchNoRecursion(nums, 4));
        System.out.println(binarySearchWithRecursion(nums, 4, 0, nums.length - 1));
    }

    public static boolean elementIsIncluded(Integer[] array, Integer element) {
        for (Integer el : array) {
            if (el.equals(element)) return true;
        }
        return false;
    }

    public static boolean binarySearchNoRecursion(Integer[] array, Integer element) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (array[middle].equals(element)) {
                return true;
            } else if (element < array[middle]) {
                last -= 1;
            } else {
                first += 1;
            }
        }
        return false;
    }

    public static int binarySearchWithRecursion(Integer[] array, Integer element, int l, int r) {
        if (l == r) {
            return (array[l].equals(element)) ? l : -1;
        }
        int m = l + (r - l) / 2;
        if (element > array[m]) return binarySearchWithRecursion(array, element, m + 1, r);
        else if (element < array[m]) return binarySearchWithRecursion(array, element, l, m - 1);
        return m;
    }
}

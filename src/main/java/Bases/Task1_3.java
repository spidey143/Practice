package Bases;

import java.util.Arrays;

public class Task1_3 {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 7, 2, 8, 2};
        int[] newArray = removeNumberFromArray(array, 2);
        System.out.println("Массив после удаления числа " + 2 + ":");
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] removeNumberFromArray(int[] array, int numberToRemove) {
        int count = 0;
        for (int k : array) {
            if (k == numberToRemove) {
                count++;
            }
        }
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int j : array) {
            if (j != numberToRemove) {
                newArray[index] = j;
                index++;
            }
        }
        return newArray;
    }
}

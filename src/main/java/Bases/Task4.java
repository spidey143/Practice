package Bases;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(removeElement(5,array)));
    }

    public static int[] removeElement(int element, int[] array){
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                c++;
            } else {
                array[i - c] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - c);
    }
}

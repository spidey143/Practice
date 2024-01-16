package Bases;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int s = 0;
        int max = 0;
        int min = 999;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(10);
            s += nums[i];
            if(nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        double avg = (double) s / nums.length;
        System.out.println(Arrays.toString(nums));
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
        System.out.println("Min: " + min);
    }
}

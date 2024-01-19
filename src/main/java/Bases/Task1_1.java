package Bases;

import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

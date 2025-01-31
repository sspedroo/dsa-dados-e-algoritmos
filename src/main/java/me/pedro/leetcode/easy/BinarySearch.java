package me.pedro.leetcode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
//        Input: nums = [-1,0,3,5,9,12], target = 2
//        Output: -1
//        Explanation: 2 does not exist in nums so return -1

        int[] nums = {-1,0,3,5,9,12};

        int search = search(nums, 9);
        System.out.println(search);

        int search1 = search(nums, 2);
        System.out.println(search1);
    }

    public static int search(int[] nums, int target) {
        int comeco = 0;
        int fim = nums.length - 1;

        while (comeco <= fim) {
            int meio = (comeco + fim) / 2;
            int chute = nums[meio];

            if(chute == target) {
                return meio;
            } else if (chute > target) {
                fim = meio - 1;
            } else {
                comeco = meio +1;
            }
        }
        return -1;
    }
}

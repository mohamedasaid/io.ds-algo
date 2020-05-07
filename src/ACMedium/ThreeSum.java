package ACMedium;

/*
Given an array nums of n integers, are there elements a, b, c
in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:
The solution set must not contain duplicate triplets.

Example:
Given array nums = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    // O(n^2) time | O(n) space
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // -4, -1, -1, 0, 1, 2
        Arrays.sort(nums);
        int closeSum = 0;
        for(int i = 0; i < nums.length-2; i++) {
            // duplicate continue
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int currSum = nums[left] + nums[i] + nums[right];
                if(currSum == closeSum) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                }
               if(currSum < closeSum) {
                   // avoiding duplicate
                   int leftIndex = left;
                   while (left < right && nums[leftIndex] == nums[left]) {
                       left++;
                   }
               }else {
                   // avoiding duplicate
                   int rightIndex = right;
                   while ( left < right && nums[rightIndex] == nums[right]) {
                       right--;
                   }
               }

            }
        }


        return list;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

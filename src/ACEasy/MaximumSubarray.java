package ACEasy;

/*
Given an integer array nums, find the contiguous subarray
(containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/
public class MaximumSubarray {

    public static int maximumSubarray(int[] nums){

        int prevSeen = nums[0];
        int bestSeen = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prevSeen = prevSeen > 0 ? prevSeen + nums[i] : nums[i];
            bestSeen = Math.max(prevSeen, bestSeen);

        }

        return bestSeen;

    }


    public static void main(String[] args) {

        System.out.println(maximumSubarray(new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}));
        System.out.println(maximumSubarray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(maximumSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        // Output: 1, 55, 6

    }
}

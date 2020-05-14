package ACMedium;

/*
Suppose an array sorted in ascending order is rotated
at some pivot unknown to you beforehand.
(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
You are given a target value to search. If found in the
array return its index, otherwise return -1.
You may assume no duplicate exists in the array.
Your algorithm's runtime complexity must be in the order of O(log n).
Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

 */

public class ShiftBinarySearch {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            int leftNum = nums[left];
            int rightNum = nums[right];
            int potentialMatch = nums[mid];

            if(target == potentialMatch) {
                return mid;
            }
            else if(leftNum < potentialMatch) {
                if (target < potentialMatch && target >= leftNum) {
                    right = mid-1;
                }else {
                    left = mid + 1;
                }
            }else {
                 if(target > potentialMatch && target <= rightNum) {
                     right = mid-1;
                }else {
                     left = mid+1;
                 }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
}

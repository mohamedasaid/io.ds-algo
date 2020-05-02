package ACHard;

import java.util.Arrays;

public class SearchRange {

    // O(log(n)) time | O(1) space
    public static int[] searchRange(int[] nums, int target) {
        int[] targetRange =  {-1, -1};
        searchRange(nums, target, 0, nums.length-1, targetRange, true );
        searchRange(nums, target, 0, nums.length-1, targetRange, false );
        return targetRange;
    }

    public static void searchRange(int[] nums, int target, int left, int right, int[] targetRange, boolean goleft) {

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                if (goleft) {
                    if (mid == 0 || nums[mid - 1] != target) {
                        targetRange[0] = mid;
                        return;
                    } else {
                        right = mid - 1;

                    }
                } else {
                    if (mid == nums.length - 1 || nums[mid+1] != target) {
                        targetRange[1] = mid;
                        return;
                    } else {
                        left = mid + 1;
                    }
                }

            }
        }

    }

    public static  void main(String[] args) {
        // input 5,7,7,8,8,10
        // output [3, 4]

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
}

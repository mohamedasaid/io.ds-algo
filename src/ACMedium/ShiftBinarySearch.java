package ACMedium;

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

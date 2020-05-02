package ACMedium;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right) {
            int mid = left + (right - left)/2;
            if(nums[mid] < nums[mid+1]) {
                left = mid+1;
            }else {
                right = mid;
            }

        }
        System.out.println(nums[left]);
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        //
        int[] array = {5, 4, 3, 2, 1, 2, 10, 12, -3, 5, 6, 7, 10};
        System.out.println(findPeakElement(array));

    }
}

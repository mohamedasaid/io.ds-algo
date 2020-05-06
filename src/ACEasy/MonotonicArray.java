package ACEasy;

/*
An array is monotonic if it is either monotone increasing
or monotone decreasing.
An array A is monotone increasing if for all i <= j, A[i] <= A[j].
An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
Return true if and only if the given array A is monotonic.

Input: [1,2,2,3]
Output: true

Input: [6,5,4,4]
Output: true

Input: [1,3,2]
Output: false

Input: [1,2,4,5]
Output: true

Input: [1,1,1]
Output: true

*/

public class MonotonicArray {

    // O(n) time | O(1) space
    public static boolean isMonotonic(int[] nums) {
        int mismatch = 0, mismatch1 = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1]){
                mismatch++;
            }

            if(nums[i] > nums[i-1]){
                mismatch1++;
            }
        }

        return mismatch == 0 || mismatch1 == 0;
    }

    public static void main(String[] args) {
        //true
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
        //true
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));
        //false
        System.out.println(isMonotonic(new int[]{1, 3, 2}));
        //true
        System.out.println(isMonotonic(new int[]{1, 2, 3, 4}));
    }
}




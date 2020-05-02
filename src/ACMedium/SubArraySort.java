package ACMedium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SubArraySort {

    public static int[]  subArraySort(int[] nums) {
        int minOutOder = Integer.MAX_VALUE;
        int maxOutOder = Integer.MIN_VALUE;

        for(int i = 0; i <nums.length; i++ ) {
            int num = nums[i];
            if(outBound(i, num, nums)){
                minOutOder = Math.min(minOutOder, num);
                maxOutOder = Math.max(maxOutOder, num);

            }
        }

        if(minOutOder == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        int left = 0;
        while (nums[left]<= minOutOder ) {
            left++;
        }

        int right = nums.length-1;
        while(nums[right] >= maxOutOder) {
            right--;
        }

        return new int[]{left, right};
    }

    public static boolean outBound(int i, int num, int[] nums) {
        if(i==0) return num > nums[i+1];
        if(i==nums.length-1) return num < nums[i-1];
        return num > nums[i+1] || num < nums[i-1];
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 10,  11, 7, 12, 6, 7,  16, 18, 19};
        // output [3, 9]
        System.out.println(Arrays.toString(subArraySort(nums)));
    }
}

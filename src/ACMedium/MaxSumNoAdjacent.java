package ACMedium;

/*
maximum sun of non-adjacent elements in nums
Input:
nums = []
Output:
0

Input:
nums = [1], [1, 2]
Output:
1
2

Input:
nums = [17, 21, 22, 7, 9, 13]
Output:
52

 */


public class MaxSumNoAdjacent {
    public static int maxSumNonAdjacent(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int secondNum = nums[0];
        int firstNum = Math.max(secondNum, nums[1]);
        for(int i = 2; i < nums.length; i++) {
            int num = nums[i];
            int currNum = Math.max(firstNum, secondNum + num);
            secondNum = firstNum;
            firstNum = currNum;
        }
        return firstNum;
    }

    public static void main(String[] args) {
        int[] nums = {17, 21, 22, 7, 9, 13};
        System.out.println(maxSumNonAdjacent(new int[]{}));
        System.out.println(maxSumNonAdjacent(new int[]{1}));
        System.out.println(maxSumNonAdjacent(new int[]{1, 2}));

        System.out.println(maxSumNonAdjacent(nums));
    }
}

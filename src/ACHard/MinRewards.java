package ACHard;

/*
MegaCorp wants to give bonuses to its employees based on how many lines of codes they have written.
They would like to give the smallest positive amount to each worker consistent with the constraint
that if a developer has written more lines of code than their neighbor, they should receive more money.
Given an array representing a line of seats of employees at MegaCorp, determine how much each one should get paid.
For example, given
[10, 40, 200, 1000, 60, 30], you should return 13 // [1, 2, 3, 4, 2, 1].
[8, 4, 2, 1, 3, 6, 7, 9, 5] you should return 25 // [4, 3, 2, 1, 2, 3, 4, 5, 1]

 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinRewards {

    public static int minRewards(int[] bonuses) {
        // Write your code here.
        int[] rewards = new int[bonuses.length];
        Arrays.fill(rewards, 1);

        // 10, 40, 200, 1000, 60, 30
        //  1, 2,   3,    4,  2,   1
        for(int i = 1; i < bonuses.length; i++) {
            if(bonuses[i] > bonuses[i-1]){
                rewards[i] = rewards[i-1]+1;
            }
        }

        for(int i = bonuses.length-2; i >= 0; i--) {
            if(bonuses[i] > bonuses[i+1] ) {
                rewards[i] = Math.max(rewards[i], rewards[i+1]+1);
            }
        }


       // System.out.println(Arrays.toString(rewards));

        return IntStream.of(rewards).sum();
    }


    public static void main(String[] args) {
        int[] nums1 = {10, 40, 200, 1000, 60, 30};
        int[] nums2 = {8, 4, 2, 1, 3, 6, 7, 9, 5};
        System.out.println(minRewards(nums2));
    }
}

package ACHard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
some elements appear twice and others appear once.
Find all the elements that appear twice in this array.
Could you do it without extra space and in O(n) runtime?

Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
*/

public class FindAllDuplicateArray {
    // O(n) time | O(1) space
    // using list of array some ppl
    // might said it's O(n) space
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) -1;
            if(nums[index] < 0) {
                list.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return list;
    }

    // O(n) time | O(n) space
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            if(set.contains(i)){
                list.add(i);
            }else {
                set.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDuplicates2(new int[]{4,3,2,7,8,2,3,1}));
    }
}

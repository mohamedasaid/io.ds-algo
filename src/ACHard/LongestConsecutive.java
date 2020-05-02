package ACHard;



import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutive {

    public static int[] longestConsecutive(int[] nums){
        int[] targetRange = new int[2];
        int longestLen = 0;

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, true);
        }

        for(int i: nums) {
            if(!map.containsKey(i)) {
                continue;
            }

            map.put(i, false);
            int left = i-1;
            int right = i+1;
            int currLen = 1;

            while (map.containsKey(left)){
                map.put(left, false);
                left--;
                currLen++;
            }

            while (map.containsKey(right)) {
                map.put(right, false);
                right++;
                currLen++;
            }

            if(currLen > longestLen) {
                longestLen = currLen;
                targetRange = new int[]{left +1, right-1};
            }
        }
        return targetRange;
    }

    public static void main(String[] args) {
        int[] nums = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println(Arrays.toString(longestConsecutive(nums)));

    }
}

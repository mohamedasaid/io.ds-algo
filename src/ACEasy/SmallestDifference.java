package ACEasy;

/*
   numsOne = [-1, 5, 10, 28, 3]
   numsTwo = [26, 134, 135, 15, 17]
   output = [28, 26]

 */

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDiff(int[] numsOne, int[] numsTwo) {

        int[] smallestPair = new int[2];
        int closest = Integer.MAX_VALUE;
        int curr = Integer.MAX_VALUE;
        Arrays.sort(numsOne);
        Arrays.sort(numsTwo);
        int i = 0;
        int j = 0;
        while (i < numsOne.length  && j < numsTwo.length) {
            int first = numsOne[i];
            int second = numsTwo[j];

            if(first < second) {
                curr = second-first;
                i++;
            }else if (second < first) {
                curr = first-second;
                j++;

            }else {
                return new int[] {first, second};
            }

            if(closest > curr ) {
                closest = curr;
                smallestPair = new int[]{first, second};
            }

        }
        return smallestPair;

    }

    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17 };
        System.out.println(Arrays.toString(smallestDiff(arrayOne, arrayTwo)));
    }
}

package ACHard;


import java.util.HashMap;
import java.util.stream.IntStream;
//Given a string, find the length of the longest substring without repeating characters
/*
Input: "pwwkew"
output:[wke]
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring
*/
public class LongestSubstringWORC {

    // O(n) time | O(min(string, character)) space
    public static String longestSubstring(String str){
        HashMap<Character, Integer>  map = new HashMap<>();
        int startIdx = 0;
        int[] longest = {0, 1};
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                startIdx = Math.max(startIdx, map.get(c) + 1);
            }

            if(longest[1]-longest[0] < i+1 - startIdx) {
                longest = new int[]{startIdx, i+1};
            }
            map.put(c, i);
        }
        String res = str.substring(longest[0], longest[1]);
        return res;
    }

    // O(n) time | O(min(string, character)) space
    public static int lengthOfLongestSubstring(String str){
        HashMap<Character, Integer>  map = new HashMap<>();
        int startIdx = 0;
        int max = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                startIdx = Math.max(startIdx, map.get(c) + 1);
            }

            max = Math.max(max, i+1-startIdx);
            map.put(c, i);
        }
        return max;
    }

    public static void test() {
        String str = "abcabcbb";
        String str2 = "pwwkew";
        String res = longestSubstring(str2);
        System.out.println(res);
        String res2 = longestSubstring(str);
        System.out.println(res2);
        System.out.println(lengthOfLongestSubstring(str));
    }



    public static void main(String[] args) {
        test();
    }

}

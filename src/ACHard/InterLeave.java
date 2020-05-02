package ACHard;

public class InterLeave {

    // O(2^(n + m)) time | O(n + m) space where n is the length of
    // first string and m is the second length of the string
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() != s1.length() + s2.length()) return false;
        return areInterLeave(s1, s2, s3, 0, 0);
    }

    public static boolean areInterLeave(String s1, String s2, String s3, int i, int j) {
        int k = i+j;
        if(k == s3.length()) return true;

        if(i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            if(areInterLeave(s1, s2, s3, i+1, j)) return true;
        }

        if( j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            return areInterLeave(s1, s2, s3, i, j+1);
        }

        return false;
    }

    // O(nm) time | O(nm) space where n is the length of the
    // first string and m is the length of the second string
    public static boolean isInterleaveString(String s1, String s2, String s3) {
        if(s3.length() != s1.length() + s2.length()) return false;
        Boolean[][] cache = new Boolean[s1.length()+1][s2.length()+1];
        return areInterLeave(s1, s2, s3, 0, 0, cache);
    }

    private static boolean areInterLeave(String s1, String s2, String s3, int i, int j, Boolean[][] cache) {
        //System.out.println(i);
        int k = i+j;

        if(k == s3.length()) return true;

        if(i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            cache[i][j] = areInterLeave(s1, s2, s3, i+1, j, cache);
            if(cache[i][j]) return true;
        }

        if( j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
           cache[i][j] =  areInterLeave(s1, s2, s3, i, j+1, cache);
           return cache[i][j];
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 =  "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";

        System.out.println(isInterleaveString(s1, s2, s3));


    }
}


package problem2;

/** This solution was provided on leetcode as an ideal solution to this problem */
public class GreatestCommonDivisor_OptimizedV2 {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Check if they have non-zero GCD string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}

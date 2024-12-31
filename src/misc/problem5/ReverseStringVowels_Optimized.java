package misc.problem5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseStringVowels_Optimized {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] result = s.toCharArray();

        int start = 0, end = s.length() - 1;
        while (start <= end) {

            // Move start pointer until it points to a vowel
            while (start < end && !vowels.contains(s.charAt(start))) start++;

            // Move end pointer until it points to a vowel
            while (start < end && !vowels.contains(s.charAt(end))) end--;

            // Swap the vowels
            char temp = result[start];
            result[start] = result[end];
            result[end] = temp;

            // Move both the pointers towards each other
            start++;    end--;
        }

        return new String(result);
    }

}

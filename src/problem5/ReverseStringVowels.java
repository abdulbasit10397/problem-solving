package problem5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseStringVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels(" "));
    }

    public static String reverseVowels(String s) {
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        char[] result = new char[s.length()];

        int i = 0, j = s.length() - 1;
        while (i<=j) {
            boolean isVowelAtI = vowels.contains(String.valueOf(s.charAt(i)).toLowerCase());
            boolean isVowelAtJ = vowels.contains(String.valueOf(s.charAt(j)).toLowerCase());

            if(isVowelAtI && isVowelAtJ) {
                result[i] = s.charAt(j);
                result[j] = s.charAt(i);
                i++; j--;
            } else if (isVowelAtI) {
                result[j] = s.charAt(j);
                j--;
            } else if(isVowelAtJ) {
                result[i] = s.charAt(i);
                i++;
            } else {
                result[i] = s.charAt(i);
                result[j] = s.charAt(j);
                i++; j--;
            }
        }

        return String.valueOf(result);
    }

}

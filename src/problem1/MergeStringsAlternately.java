package problem1;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";

        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {
        String mergedString = "";
        int length = word1.length() > word2.length() ? word1.length() : word2.length();

        for (int i = 0; i < length; i++) {
            if (i < word1.length()) mergedString += String.valueOf(word1.charAt(i));
            if (i < word2.length()) mergedString += String.valueOf(word2.charAt(i));
        }

        return mergedString;
    }
}

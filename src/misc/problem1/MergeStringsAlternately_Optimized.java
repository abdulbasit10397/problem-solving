package misc.problem1;

public class MergeStringsAlternately_Optimized {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";

        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder("");
        int length = word1.length() > word2.length() ? word1.length() : word2.length();

        for (int i = 0; i < length; i++) {
            if (i < word1.length()) sb.append(word1.charAt(i));
            if (i < word2.length()) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}

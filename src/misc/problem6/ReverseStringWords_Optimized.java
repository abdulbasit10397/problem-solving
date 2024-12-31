package misc.problem6;

public class ReverseStringWords_Optimized {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello  world  "));
    }

    public static String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            if(!parts[i].isEmpty()) sb.append(parts[i] + " ");
        }

        return sb.toString().trim();
    }
}

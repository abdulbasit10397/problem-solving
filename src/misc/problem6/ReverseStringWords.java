package misc.problem6;

public class ReverseStringWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            if(parts[i].trim().equals("")) continue;
            sb.append(parts[i]);
            if(i>0) sb.append(" ");
        }

        return sb.toString().trim();
    }
}

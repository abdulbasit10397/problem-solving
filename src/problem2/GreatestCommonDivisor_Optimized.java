package problem2;

import java.util.HashSet;
import java.util.Set;

/** This solution is optimized in terms that the code is comparatively shorter now*/

public class GreatestCommonDivisor_Optimized {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        String shorterStr = str1.length() < str2.length() ? str1 : str2;
        int length = str1.length() > str2.length() ? str1.length() : str2.length();

        for (int i = shorterStr.length() - 1; i >= 0; i--) {
            String subStr = shorterStr.substring(0, i + 1);

            String str1SubStr = "", str2SubStr = "";
            int j = 0;
            Set<String> set = new HashSet<>();
            while (j < length) {
                if (j < str1.length()) {
                    if(j + subStr.length() <= str1.length()) str1SubStr = str1.substring(j, j + subStr.length());
                    else str1SubStr = str1.substring(j);
                }

                if (j < str2.length()) {
                    if(j + subStr.length() <= str2.length()) str2SubStr = str2.substring(j, j + subStr.length());
                    else str2SubStr = str2.substring(j);
                }
                set.add(subStr); set.add(str1SubStr); set.add(str2SubStr);
                if(j==length-subStr.length() && set.size()==1) return subStr;


                j+=subStr.length();
            }
        }

        return "";
    }

}

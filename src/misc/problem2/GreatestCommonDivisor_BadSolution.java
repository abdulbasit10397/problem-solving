package misc.problem2;

public class GreatestCommonDivisor_BadSolution {
    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        int length = str1.length() > str2.length() ? str1.length() : str2.length();
        int str1Val = 0, str2Val = 0;
        for (int i = 0; i < length; i++) {
            if (i < str1.length()) str1Val += str1.charAt(i);
            if (i < str2.length()) str2Val += str2.charAt(i);
        }

        int hcf = findHcf(str1Val, str2Val);
        if (hcf < 2) return "";
        int asciiSumStr1 = 0, asciiSumStr2 = 0;
        String result1 = "";
        String result2 = "";
        int i;
        for (i = 0; i < length; i++) {
            if (i < str1.length()) {
                asciiSumStr1 += str1.charAt(i);
                result1 += str1.charAt(i);
            }
            if (i < str2.length()) {
                asciiSumStr2 += str2.charAt(i);
                result2 += str2.charAt(i);
            }

            if (asciiSumStr1 == asciiSumStr2 && asciiSumStr1 == hcf && result1.equals(result2)) {
                if (i < length - 1 && i < str1.length() - 1 && i < str2.length() - 1) {
                    result1 = "";
                    result2 = "";
                    asciiSumStr1 = 0;
                    asciiSumStr2 = 0;
                } else if (i < length - 1 && i < str1.length() - 1) {
                    result1 = "";
                    asciiSumStr1 = 0;
                } else if (i < length - 1 && i < str2.length() - 1) {
                    result2 = "";
                    asciiSumStr2 = 0;
                } else {
                    return result1;
                }
            }
        }

        return "";
    }

    public static int findHcf(int a, int b) {
        int hcf = -1;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }

        return hcf;
    }
}

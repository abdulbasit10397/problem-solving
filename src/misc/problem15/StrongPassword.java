package misc.problem15;

/**
 * HackerRank Link: https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=false
 * Solution Approach:
 * * Maintain flag for each check and iterate over password characters
 * * * For each character, validate checks
 * * Once the iteration is over, see how many characters to add based on checks values
 */
public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        int minimumChars = 0, minimumLength = 6;
        boolean digit, lowerCase, upperCase, specialChar;
        digit = lowerCase = upperCase = specialChar = false;
        String allowedSpecialChars = "!@#$%^&*()-+";

        for(char ch : password.toCharArray()) {
            if(Character.isLowerCase(ch)) lowerCase = true;
            if(Character.isUpperCase(ch)) upperCase = true;
            if(Character.isDigit(ch)) digit = true;
            if(allowedSpecialChars.contains(String.valueOf(ch))) specialChar = true;
        }

        if(!digit) minimumChars++; if(!lowerCase) minimumChars++;
        if(!upperCase) minimumChars++; if(!specialChar) minimumChars++;

        int finalChars = n + minimumChars;
        if(finalChars < minimumLength) minimumChars += (minimumLength-finalChars);

        return minimumChars;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(11, "#HackerRank"));
    }
}

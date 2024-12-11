package problem11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HackerRank Link: https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=false
 * Solution Approach:
 * * * If Sum of All the elements is odd, result will be NO
 * * * If sum is even, then if element is odd, add a loaf to it
 * * * * If previous element is odd, add a loaf to it
 * * * * If previous is even then give loaf to next element
 */
public class FairRations {

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static String fairRations(List<Integer> A) {
        String result = "";
        List<Integer> B = new ArrayList<>();
        B.addAll(A);
        int originalSum = 0, breadDist = 0;

        for(int i=0; i<B.size(); i++){
            originalSum+= A.get(i);

            if(isOdd(B.get(i))) {
                B.set(i, B.get(i) + 1);
                breadDist ++;

                if(i > 0 && isOdd(B.get(i-1))) {
                    int prevBreadLoaves = B.get(i-1);
                    B.set(i-1, prevBreadLoaves + 1);
                    breadDist++;
                } else if(i + 1 < B.size()) {
                    int nextBreadLoaves = B.get(i+1);
                    B.set(i+1, nextBreadLoaves + 1);
                    breadDist++;
                }
            }
        }

        if(isOdd(originalSum)) {
            result = "NO";
        } else {
            result = String.valueOf(breadDist);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> breadLoaves = Arrays.asList(1, 2);
        String result = fairRations(breadLoaves);
        System.out.println(result);
    }
}

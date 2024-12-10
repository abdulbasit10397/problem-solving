package problem10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Solution Approach:
 * for k = 2, it will be
 * 3, 4, 5, 6 -> 6, 3, 4, 5 -> 5, 6, 3, 4
 *
 * a = 3, 4, 5, 6
 * a = 4, 3, 5, 6 -> i = 0
 * a = 5, 3, 4, 6 -> i = 2
 * a = 6, 3, 4, 5 -> i = 3 */
public class CircularArrayRotation {

    public static List<Integer> circularArrayRotationApproach1(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        List<Integer> rotatedList = new LinkedList<>();
        rotatedList.addAll(a);

        int iterator = 0;
        while (iterator < k) {
            int shifted;
            for(int i = 0; i< rotatedList.size(); i++) {
                shifted = rotatedList.get(i);
                if(i == 0) {
                    rotatedList.set(0, rotatedList.get(1));
                    rotatedList.set(1, shifted);
                    i = 1;
                }
                else {
                    rotatedList.set(i, rotatedList.get(0));
                    rotatedList.set(0, shifted);
                }
                System.out.println("");
            }

            iterator++;
        }

        for(Integer q: queries) {
            result.add(rotatedList.get(q));
        }
        return result;
    }

    public static List<Integer> circularArrayRotationApproach1Optimized(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        int iterator = 0;
        while (iterator < k) {
            int shifted;
            for(int i = 0; i< a.size(); i++) {
                shifted = a.get(i);
                if(i == 0) {
                    a.set(0, a.get(1));
                    a.set(1, shifted);
                    i = 1;
                }
                else {
                    a.set(i, a.get(0));
                    a.set(0, shifted);
                }
                System.out.println("");
            }

            iterator++;
        }

        for(Integer q: queries) {
            result.add(a.get(q));
        }
        return result;
    }

    public static List<Integer> circularArrayRotationApproach2(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<queries.size(); i++) {
            int index = queries.get(i);
            int rotatedIndex;
            int indexDifference = index - k;
            if(indexDifference >= 0) {
                rotatedIndex = index - k;
            } else {
                rotatedIndex = (a.size()) + (indexDifference);
            }

            result.add(a.get(rotatedIndex));
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        List<Integer> a = Arrays.asList(3, 4, 5);
        List<Integer> queries = Arrays.asList(1, 2);
        List<Integer> result = circularArrayRotationApproach2(a, 2, queries);
        System.out.println(result);
    }
}

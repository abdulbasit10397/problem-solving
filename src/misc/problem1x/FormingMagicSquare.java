package misc.problem1x;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/magic-square-forming/problem
 */
public class FormingMagicSquare {
    /**
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    /**
     * Solution Hints:
     * * The sum of each side and diagonal in 3x3 magic square will be 15
     * * Use a predefined magic square matrix. For 3x3, there are total of 8 magic square combinations
     */

    public static int getCostForMagicSum(List<List<Integer>> s, int i, int j) {
        int sideCost = 0;
//        for()

        return sideCost;
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int cost = 0;
        for(int i=0; i<3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for(int row=0; row < 3; row++) {
                System.out.print(s.get(i).get(row) + "   ");
                rowSum+=s.get(i).get(row);

                if(row == 2 & rowSum != 15) {

                }
            }
            System.out.println();

            for(int col = 0; col<3; col++) {
                System.out.print(s.get(col).get(i) + "   ");
                colSum = s.get(col).get(i);
            }

//            if(rowSum!=)
//
//            if ()
        }

        return cost;
    }


//    5 3 4
//    1 5 8
//    6 4 2
    public static void main(String[] args) throws IOException {
        List<List<Integer>> matrixOf3 = Arrays.asList(
                Arrays.asList(5, 3, 4),
                Arrays.asList(1, 5, 8),
                Arrays.asList(6, 4, 2)
        );

        formingMagicSquare(matrixOf3);
    }
}

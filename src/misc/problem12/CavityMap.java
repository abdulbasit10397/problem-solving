package misc.problem12;

import java.util.ArrayList;
import java.util.List;

/**
 * HackerRank Link: https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=false
 * Solution Approach:
 * * Iterate over whole square matrix
 * * * Skip cavity check for border cels
 * * * For inner cells, do cavity check and if check passes add the cell as X n newRow
 * * * If check fails, add the cell value as it is in newRow
 * * * Add row in cavities list
 */
public class CavityMap {

    public static int toInt(char ch) {
        return Character.getNumericValue(ch);
    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> cavities = new ArrayList<>();

        for(int i=0; i<grid.size(); i++) {
            String row = grid.get(i);
            StringBuilder newRow = new StringBuilder();
            for(int j=0; j<row.length()-0; j++) {
                if (i == 0 || i == grid.size() - 1 || j == 0 || j == row.length() - 1) {
                    newRow.append(row.charAt(j));
                } else {
                    int cell = toInt(row.charAt(j));
                    int left = toInt(row.charAt(j - 1)), right = toInt(row.charAt(j + 1));
                    int top = toInt(grid.get(i - 1).charAt(j)), bottom = toInt(grid.get(i+1).charAt(j));
                    if (cell > left && cell > right && cell > top && cell > bottom) {
                        newRow.append('X');
                    } else {
                        newRow.append(row.charAt(j));
                    }
                }
            }
            cavities.add(newRow.toString());
            System.out.println();
        }


        return cavities;
    }


    public static void main(String[] args) {
        List<String> grid = List.of("989", "191", "111");
        List<String> grid2 = List.of("1112", "1912", "1892", "1234");
        cavityMap(grid2);
    }
}

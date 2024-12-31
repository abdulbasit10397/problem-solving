package misc.problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Optimized for performance
 */
public class KidsWithGreatestCandies_Optimized {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};

        System.out.println(kidsWithCandies(candies, 1));
    }


    /**
     * This code has increase performance
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int n : candies) {
            if (n > maxCandies) maxCandies = n;
        }

        List<Boolean> result = new ArrayList<>();
        for (int n : candies) {
            result.add(n + extraCandies >= maxCandies);
        }

        return result;
    }

    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies)
                .parallel()
                .mapToObj(x -> x + extraCandies >= maxCandies)
                .collect(Collectors.toList());
    }
}

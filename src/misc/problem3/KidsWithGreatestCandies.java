package misc.problem3;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public static void main (String[] args) {
        int[] candies = {12,1,12};

        System.out.println(kidsWithCandies(candies, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i<candies.length; i++) {
            boolean hasGreatestCandies = true;
            for (int j=0; j<candies.length; j++) {
                if(j==i) continue;
                if(candies[i] + extraCandies < candies[j]) hasGreatestCandies = false;
            }
            result.add(hasGreatestCandies);
        }

        return result;
    }
}

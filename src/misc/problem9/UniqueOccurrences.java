package misc.problem9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Not adding an optimized solution because this solution beats
 * Performance: 98.35% of users with Java
 * Memory: 74.80% of users with Java
 */
public class UniqueOccurrences {
    public static void main (String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numberOccurrenceMap = new HashMap<>();
        Set<Integer> occurrenceSet = new HashSet<>();

        for(int n : arr) {
            if(numberOccurrenceMap.containsKey(n)) {
                int occurrence = numberOccurrenceMap.get(n);
                numberOccurrenceMap.put(n, ++occurrence);
                continue;
            }

            numberOccurrenceMap.put(n, 1);
        }

        for(Map.Entry<Integer, Integer> entry : numberOccurrenceMap.entrySet()) {
            if(occurrenceSet.contains(entry.getValue())) return false;

            occurrenceSet.add(entry.getValue());
        }

        return true;
    }
}

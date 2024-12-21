package problem14;

import java.util.*;

/**
 * HackerRank Link: https://www.hackerrank.com/challenges/gem-stones/problem?isFullScreen=false
 * Solution Approach:
 * * Create a list of character set for each string in input array of strings
 * * * Then pick the first string from input strings and find it in every set
 * * * Maintain a map for char - count and at the end of processing,
 * * * * Return the length of all chars which has length equal to length of input list of strings
 */
public class Gemstones {
    public static int gemstones(List<String> arr) {
        List<Set<Character>> arrSet = new ArrayList<>();
        for(String s: arr) {
            Set<Character> tempSet = new HashSet<>();
            for(int i=0; i<s.length(); i++) {
                tempSet.add(s.charAt(i));
            }
            arrSet.add(tempSet);
        }

        Map<Character, Integer> charCount = new HashMap<>();
        Set<Character> firstItem = arrSet.get(0);
        for(char ch: firstItem) {
            charCount.put(ch, 1);

            for(int i=1; i<arrSet.size(); i++){
                if(arrSet.get(i).contains(ch)) {
                    charCount.put(ch, charCount.get(ch) + 1);
                }
            }
        }

        int gemstones = 0;
        for(Map.Entry e: charCount.entrySet()) {
            if(e.getValue().equals(arr.size())) {
                gemstones++;
            }
        }

        System.out.println(arrSet);
        return gemstones;
    }

    public static void main(String[] args) {
        List<String> stones = List.of("abcdde", "baccd", "eeabg");
        gemstones(stones);
    }
}

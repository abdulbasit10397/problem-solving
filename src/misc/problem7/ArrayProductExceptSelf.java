package misc.problem7;

import java.util.Arrays;

/** This is O(n^2) solution.
 * The solution works but requirement is to write O(n) solution
 */
public class ArrayProductExceptSelf {
    public static void main(String[] args) {
        int[] numbers = {-1,1,0,-3,3};
        Arrays.stream(productExceptSelf(numbers)).forEach(n -> System.out.print(n + " "));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) product *= nums[j];
            }

            result[i] = product;
        }

        return result;
    }
}

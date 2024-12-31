package misc.problem7;

import java.util.Arrays;

//Solution Explanation Url: https://youtu.be/5bS636lE_R0
public class ArrayProductExceptSelf_Accepted {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        Arrays.stream(productExceptSelf(numbers)).forEach(n -> System.out.print(n + " "));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prefix[i] = prefix[i] * suffix;
            suffix = suffix * nums[i];
        }

        return prefix;
    }
}

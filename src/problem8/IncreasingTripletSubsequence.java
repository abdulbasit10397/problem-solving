package problem8;

/** Time Limit exceeded for the 75th test case in this solution*/
public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        int[] numbers = {20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(numbers));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int a, b, c;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            a = nums[i];
            b = nums[j];
            for (; j < nums.length - 1; j++) {
                c = nums[j + 1];
                if (a < c && c < b) b = c;
                if (a < b && b < c) return true;
            }
        }

        return false;
    }
}

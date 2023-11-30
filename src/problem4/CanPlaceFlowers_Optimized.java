package problem4;

/**
 * Optimized Solution for can place flowers problem
 */
public class CanPlaceFlowers_Optimized {
    public static void main(String[] args) {
        int[] flowerbed = {0, 0, 0, 1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(flowerbed, 3));
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers = 0;
        for (int i = 0; i < flowerbed.length; i++) {

        }

        return flowers >= n;
    }
}
